package GUI;

import algoritmos.GradeInvalidaException;
import algoritmos.geradores_de_grade;
import algoritmos.metodos_auxiliares;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class PainelDesenho extends JPanel{
    int x;
    int y;
    int lado = 300;
    private int n;
    boolean diagonais, Fujimoto, Haag, Noma, Haga;
    ArrayList<Integer> sequencia;
    Graphics2D g1;

    public void setN(int n) throws GradeInvalidaException {
        if (metodos_auxiliares.menorPotencia2(n) == n){
            throw new GradeInvalidaException();
        } else {
            this.n = n;
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        this.g1 = (Graphics2D) g;
        
        g1.setStroke(new BasicStroke(2));
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        x = (this.getWidth()-lado)/2;
        y = (this.getHeight()-lado)/2;
        g1.drawRect(x, y, lado, lado);
        
        g1.setFont(new Font("Arial", Font.PLAIN, 14));
        
        if (diagonais){//Se o método das diagonais for selecionado.
            g1.setStroke(new BasicStroke(1));
            double w = geradores_de_grade.grade_diagonais(n);
            
            sequencia = metodos_auxiliares.inverterSequencia(metodos_auxiliares.fracaoBinaria(w));
            
            Point2D.Double diagonal1_ini = new Point2D.Double(x, y);
            Point2D.Double diagonal1_fim = new Point2D.Double(x+lado, y+lado);
            Point2D.Double diagonal2_ini = new Point2D.Double(x, y+lado);
            Point2D.Double diagonal2_fim = new Point2D.Double(x+lado, y+(1-w)*lado);
            
            Line2D.Double diagonal1 = new Line2D.Double(diagonal1_ini, diagonal1_fim);
            Line2D.Double diagonal2 = new Line2D.Double(diagonal2_ini, diagonal2_fim);
            
            g1.setColor(Color.red);
            g1.draw(diagonal1);
            g1.draw(diagonal2);
            
            g1.drawString(metodos_auxiliares.converter_para_fracao(w), (int) diagonal2_fim.x+5, (int) diagonal2_fim.y+5);//Alterar esta linha
            
            int grade_ref = metodos_auxiliares.maiorPotencia2(n);
            Point2D.Double ponto_grade_ref = new Point2D.Double(x+lado/n*grade_ref, y+lado+10);
            Line2D.Double linha_grade_ref = new Line2D.Double(new Point2D.Double(x, y+lado+10),ponto_grade_ref);
            g1.setColor(Color.magenta);
            g1.draw(linha_grade_ref);
            g1.drawString(grade_ref+"", (int) metodos_auxiliares.centro_da_linha(linha_grade_ref).x,
                                        (int) metodos_auxiliares.centro_da_linha(linha_grade_ref).y+20);
            
            g1.setColor(Color.black);
            g1.drawOval((int) Math.round(x+grade_ref*lado/n-2.5), (int) Math.round(y+grade_ref*lado/n-2.5), 5, 5);
            
            grade_vert();
        }
        if (Fujimoto){//Se o método de Fujomoto for selecionado.
            g1.setStroke(new BasicStroke(1));
            g1.setColor(Color.red);
            double w = geradores_de_grade.grade_Fujimoto(n);
            sequencia = metodos_auxiliares.inverterSequencia(metodos_auxiliares.fracaoBinaria(w));
            double w0 = 1-Math.sqrt(1-w*w);
            
            Point2D.Double ref_horizontal_ini = new Point2D.Double(x, y+(1-w)*lado);
            Point2D.Double ref_horizontal_fim = new Point2D.Double(x+w0*lado+40, y+(1-w)*lado);
            g1.draw(new Line2D.Double(ref_horizontal_ini, ref_horizontal_fim));
            
            g1.drawString(metodos_auxiliares.converter_para_fracao(w),(int) ref_horizontal_ini.x-40, (int) ref_horizontal_ini.y+5);
            
            float[] pontilhado = {2,2};
            g1.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, pontilhado, 0));
            g1.setColor(Color.gray);
            g1.draw(new Line2D.Double(x+lado, y+lado, x+w0*lado, y+(1-w)*lado));
            g1.draw(new Line2D.Double(x+w0*lado, y+(1-w)*lado, x+((w-w0)/(1-w0))*lado, y));
            
            float[] tracejado = {5,5};
            g1.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, tracejado, 0));
            g1.setColor(Color.red);
            Line2D.Double linha_aux = new Line2D.Double(x+lado, y+lado, x+((w-w0)/(1-w0))*lado, y);
            g1.draw(linha_aux);
            
            g1.setStroke(new BasicStroke(1));
            g1.draw(new Line2D.Double(metodos_auxiliares.centro_da_linha(linha_aux).x,
                    metodos_auxiliares.centro_da_linha(linha_aux).y, x+lado, y+(1-1/(1+w))*lado));
            
            g1.setColor(Color.magenta);
            int grade_ref = metodos_auxiliares.maiorPotencia2(n);
            Line2D.Double linha_grade_ref = new Line2D.Double(x+lado+10,y+lado,x+lado+10, y+(1-(double)grade_ref/n)*lado);
            g1.draw(linha_grade_ref);
            g1.drawString(grade_ref+"", (float) metodos_auxiliares.centro_da_linha(linha_grade_ref).x+10,
                    (float) metodos_auxiliares.centro_da_linha(linha_grade_ref).y);
            
            g1.setColor(Color.black);
            g1.drawOval((int) Math.round(x+lado-2.5), (int) Math.round(y+(1-(double)grade_ref/n)*lado-2.5), 5, 5);
            
            grade_horiz();
        }
        if (Haag){//Se o método de Haag for selecionado.
            g1.setColor(Color.red);
            g1.setStroke(new BasicStroke(1));
            
            Line2D.Double linha_media = new Line2D.Double(x, y+lado/2, x+lado, y+lado/2);
            g1.draw(linha_media);
            
            double w = geradores_de_grade.grade_Haag(n);
            sequencia = metodos_auxiliares.inverterSequencia(metodos_auxiliares.fracaoBinaria(w));
            
            Point2D.Double linha_ref_ini = new Point2D.Double(x, y+lado);
            Point2D.Double linha_ref_fim = new Point2D.Double(x+lado, y+(double)(1-w)*lado);
            g1.draw(new Line2D.Double(linha_ref_ini,linha_ref_fim));
            
            g1.drawString(metodos_auxiliares.converter_para_fracao(w), (float) linha_ref_fim.x+5, (float) linha_ref_fim.y+5);
            
            int grade_ref = metodos_auxiliares.maiorPotencia2(n);
            g1.setColor(Color.magenta);
            Line2D.Double linha_grade_ref = new Line2D.Double(x, y+lado+10, x+(double)lado/n*grade_ref, y+lado+10);
            g1.draw(linha_grade_ref);
            Point2D.Double mid_linha_grade_ref = metodos_auxiliares.centro_da_linha(linha_grade_ref);
            g1.drawString(grade_ref+"", (float) mid_linha_grade_ref.x, (float) mid_linha_grade_ref.y+20);
            
            g1.setColor(Color.black);
            g1.drawOval((int) Math.round(x+grade_ref*lado/n-2.5), (int) Math.round(y+lado/2-2.5), 5, 5);
            
            grade_vert();
        }
        if (Noma){//Se o método de Noma for selecionado.
            g1.setStroke(new BasicStroke(1));
            g1.setColor(Color.red);
            
            double w = geradores_de_grade.grade_Noma(n);
            double y1 = 1/(2*(1-w));
            double y2 = (1-2*w)/(2*(1-w));
            sequencia = metodos_auxiliares.inverterSequencia(metodos_auxiliares.fracaoBinaria(w));
            
            Line2D.Double marca_horiz = new Line2D.Double(x, y+(1-w)*lado, x+40, y+(1-w)*lado);
            Line2D.Double marca_vert = new Line2D.Double(x+w*lado, y, x+w*lado, y+40);
            g1.draw(marca_horiz);
            g1.draw(marca_vert);
            g1.drawString(metodos_auxiliares.converter_para_fracao(w), (float) marca_horiz.x1-40, (float) marca_horiz.y1+5);
            g1.drawString(metodos_auxiliares.converter_para_fracao(w), (float) marca_vert.x1, (float) marca_vert.y1-5);
            
            Point2D.Double ref1 = new Point2D.Double(x, y+(1-y1)*lado);
            Point2D.Double ref2 = new Point2D.Double(x+lado, y+(1-y2)*lado);
            float[] pontilhado = {5,5};
            g1.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, pontilhado, 0));
            g1.draw(new Line2D.Double(ref1, ref2));
            
            g1.setStroke(new BasicStroke(1));
            g1.setColor(Color.gray);
            g1.draw(new Line2D.Double(x, y+(1-w)*lado, x+w*lado, y));
            
            g1.setColor(Color.black);
            g1.drawOval((int) Math.round(ref1.x-2.5), (int) Math.round(ref1.y-2.5), 5, 5);
            g1.drawOval((int) Math.round(ref2.x-2.5), (int) Math.round(ref2.y-2.5), 5, 5);
            
            g1.setColor(Color.magenta);
            int grade_ref = metodos_auxiliares.maiorPotencia2(n);
            Line2D.Double linha_grade_ref = new Line2D.Double(x+lado+10,y+lado,x+lado+10, y+(1-(double)grade_ref/n)*lado);
            g1.draw(linha_grade_ref);
            g1.drawString(grade_ref+"", (float) metodos_auxiliares.centro_da_linha(linha_grade_ref).x+10,
                    (float) metodos_auxiliares.centro_da_linha(linha_grade_ref).y);
            
            grade_horiz();
        }
        if (Haga){
            g1.setStroke(new BasicStroke(1));
            g1.setColor(Color.red);
            
            double x0 = geradores_de_grade.grade_Haga(n);
            double y1 = (1+x0*x0)/2;
            double y2 = y1-x0;
            double m = (1-y1)/x0;
            double x1 = (1-y2+m+x0/m)/(m+1/m);
            sequencia = metodos_auxiliares.inverterSequencia(metodos_auxiliares.fracaoBinaria(x0));
            
            Line2D.Double marca_vert = new Line2D.Double(x+x0*lado, y, x+x0*lado, y+40);
            g1.draw(marca_vert);
            g1.drawString(metodos_auxiliares.converter_para_fracao(x0), (float) marca_vert.x1-5, (float) marca_vert.y1-5);
            
            g1.setStroke(new BasicStroke(2));
            g1.setColor(Color.gray);
            Path2D.Double papel_dobrado = new Path2D.Double();
            papel_dobrado.moveTo(x, y+(1-y1)*lado);
            papel_dobrado.lineTo(x+lado, y+(1-y2)*lado);
            papel_dobrado.lineTo(x+x1*lado, y+((x1-x0)/m)*lado);
            papel_dobrado.lineTo(x+x0*lado, y);
            papel_dobrado.closePath();
            g1.draw(papel_dobrado);
            
            g1.setColor(Color.black);
            
            g1.draw(new Arc2D.Double(new Rectangle2D.Double(x+lado-20, y, 40, 2*x0/(1+x0)*lado), -80, 160, Arc2D.OPEN));
            
            g1.setStroke(new BasicStroke(1));
            
            g1.drawOval((int) Math.round(x+lado-2.5), (int) Math.round(y+2*x0/(1+x0)*lado-2.5), 5, 5);
            g1.drawOval((int) Math.round(x+lado-2.5), (int) Math.round(y+x0/(1+x0)*lado-2.5), 5, 5);
            
            g1.setColor(Color.magenta);
            int grade_ref = metodos_auxiliares.maiorPotencia2(n);
            Line2D.Double linha_grade_ref = new Line2D.Double(x-10,y+lado,x-10, y+(1-(double)grade_ref/n)*lado);
            g1.draw(linha_grade_ref);
            g1.drawString(grade_ref+"", (float) metodos_auxiliares.centro_da_linha(linha_grade_ref).x-10,
                    (float) metodos_auxiliares.centro_da_linha(linha_grade_ref).y);
            
            grade_horiz();
        }
    }
    
    public void zeraMetodos(){
        diagonais = false;
        Fujimoto = false;
        Haag = false;
        Noma = false;
        Haga = false;
    }
    
    public void grade_vert(){
        g1.setColor(Color.green);
        float largura = (float) lado/n;
        for (int i = 1; i < n; i++) {
            g1.draw(new Line2D.Float(x+largura*i, y, x+largura*i, y+lado));
        }
    }
    
    public void grade_horiz(){
        g1.setColor(Color.green);
        float largura = (float) lado/n;
        for (int i = 1; i < n; i++) {
            g1.draw(new Line2D.Float(x, y+largura*i, x+lado, y+largura*i));
        }
    }
    
}
