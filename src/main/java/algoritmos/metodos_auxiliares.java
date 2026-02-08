package algoritmos;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
        
public class metodos_auxiliares {
    //Calcula a menor potência de 2 maior do que o número.
    public static int menorPotencia2(double num){
        int p = 2;
        while (p < num){
            p *= 2;
        }
        return p;
    }
    //Calcula a maior potência de 2 menor do que o número.
    public static int maiorPotencia2(double num){
        int p = 2;
        while(p <= num){
            p *= 2;
        }
        return p/2;
    }
    //Converte uma fração da forma 0<a/2^n<1 para a forma binária (será usado para o algoritmo do passo-a-passo).
    public static ArrayList<Integer> fracaoBinaria(double num){
        ArrayList<Integer> s = new ArrayList<>();
        double t = 2*num;
        while(t !=0){
            int digito = (int) Math.floor(t);
            switch (digito) {
                case 0 -> s.add(0);
                case 1 -> s.add(1);
            }
            t = 2*(t-digito);
        }
        return s;
    }
    //Retorna o maior dos valores a e b.
    public static double maior(double a, double b){
        if (a > b){
            return a;
        } else {
            return b;
        }
    }
    //Inverte os dígitos da representação binária
    public static ArrayList<Integer> inverterSequencia(ArrayList<Integer> seq){
        ArrayList<Integer> seq_inv = new ArrayList<>();
        for (int i = seq.size()-1; i>=0; i--){
            seq_inv.add(seq.get(i));
        }
        return seq_inv;
    }
    //Retorna o ponto médio da linha
    public static Point2D.Double centro_da_linha(Line2D.Double linha){
        double mx = (linha.x1+linha.x2)/2;
        double my = (linha.y1+linha.y2)/2;
        Point2D.Double midPoint = new Point2D.Double(mx, my);
        return midPoint;
    }
    //Converte um valor double para fração a/b.
    public static String converter_para_fracao(double d) {
        String s = String.valueOf(d);
        int numerosDepoisDoPonto = s.length() - s.indexOf('.') - 1;//Número de casas decimais após o ponto.
        
        int denominador = Math.powExact(10, numerosDepoisDoPonto);// Denominador é uma potência de 10.
        int numerador = (int) (d * denominador);
        
        int mdc = mdc(numerador, denominador);// Simplificar
        return (numerador / mdc) + "/" + (denominador / mdc);
    }
    // Máximo Divisor Comum
    public static int mdc(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}