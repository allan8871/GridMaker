package GUI;

import algoritmos.metodos_auxiliares;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PainelPassoAPasso extends JPanel {

    int x;
    int y;
    int lado = 300;
    ArrayList<Integer> sequencia;
    ArrayList<Line2D.Double> linhas_passo_a_passo = new ArrayList<>();
    ArrayList<Rectangle2D.Double> flechas_rect = new ArrayList<>();
    int passo_atual = 0;

    public void construirLinhas() {
        /*Limpa os ArrayLists ao chamar paintComponent no repaint() para que não adicione itens
          às listas existentes*/
        linhas_passo_a_passo.clear();
        flechas_rect.clear();

        x = (this.getWidth()-lado)/2;
        y = (this.getHeight()-lado)/2;

        Line2D.Double linha_sup = new Line2D.Double(x, y, x+lado, y);
        Line2D.Double linha_inf = new Line2D.Double(x, y+lado, x+lado, y+lado);
        Line2D.Double linha_atual = linha_inf;

        Rectangle2D.Double arc_rect_limiter = null;

        try {
        for (int i : sequencia) {
            double y_medio = 0;
            if (i == 1){
                y_medio = (linha_sup.y1+linha_atual.y1)/2;
                arc_rect_limiter = new Rectangle2D.Double(
                        metodos_auxiliares.centro_da_linha(linha_sup).x-25,
                        metodos_auxiliares.centro_da_linha(linha_sup).y,
                        50, Math.abs(linha_atual.y1-linha_sup.y1));
            }
            if (i == 0){
                y_medio = (linha_inf.y1+linha_atual.y1)/2;
                arc_rect_limiter = new Rectangle2D.Double(
                        metodos_auxiliares.centro_da_linha(linha_atual).x-25,
                        metodos_auxiliares.centro_da_linha(linha_atual).y,
                        50, Math.abs(linha_atual.y1-linha_inf.y1));
            }
            linha_atual = new Line2D.Double(x, y_medio, x+lado, y_medio);
            linhas_passo_a_passo.add(linha_atual);
            flechas_rect.add(arc_rect_limiter);
        }
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(this, "Grade não gerada.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g1 = (Graphics2D) g;

        g1.setStroke(new BasicStroke(2));
        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g1.drawRect(x, y, lado, lado);

        float[] tracejado = {5,5};
        g1.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10, tracejado, 0));
        //g1.setStroke(new BasicStroke(1));
        g1.setColor(Color.blue);

        // desenha apenas até o passo atual
        for (int i = 0; i < passo_atual+1 && i < linhas_passo_a_passo.size(); i++) {
            if (i == linhas_passo_a_passo.size()-1){
                g1.setColor(Color.green);
            }
            g1.draw(linhas_passo_a_passo.get(i));
            if (i == passo_atual){
                g1.setColor(Color.gray);
                g1.setStroke(new BasicStroke(2));
                g1.draw(new Arc2D.Double(flechas_rect.get(i),-80,160,Arc2D.OPEN));
            }
            g1.setColor(Color.blue);
        }
    }

    public void next_step() {
        if (passo_atual < linhas_passo_a_passo.size()-1) {
            passo_atual +=1;
            repaint();
        }
    }

    public void prev_step() {
        if (passo_atual > 0){
            passo_atual -=1;
            repaint();
        }
    }
    
    public void reset() {
        passo_atual = 0;
        repaint();
    }
}