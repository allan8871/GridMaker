package algoritmos;

public class geradores_de_grade {
    
    private static double[] diagonais(double a, double b){
        //Auxiliares
        double m = a;
        double n = b-a;
        int p = metodos_auxiliares.menorPotencia2(metodos_auxiliares.maior(a, b-a));
        //Referências
        double w = m/p;//Lado esquerdo
        double x = n/p;//Lado direito
        double[] s = {w, x};
        return s;
    }
    public static double grade_diagonais(int n){
        double[] s = diagonais(metodos_auxiliares.maiorPotencia2(n), n);
        return s[1];
    }
    public static double grade_Fujimoto(int n){
        int p = metodos_auxiliares.maiorPotencia2(n);
        double x = (double) (n-p)/p;
        return x;
    }
    public static double grade_Haag(int n){
        int p = metodos_auxiliares.maiorPotencia2(n);
        double y = (double) n/(2*p);
        return y;
    }
    public static double grade_Noma(int n){
        int p = metodos_auxiliares.maiorPotencia2(n);
        double w = 1-(double)n/(2*p);
        return w;
    }
    public static double grade_Haga(int n){
        int p = metodos_auxiliares.maiorPotencia2(n);
        double w = (double)(n-p)/p;
        return w;
    }
}
