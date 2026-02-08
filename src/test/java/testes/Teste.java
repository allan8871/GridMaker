package testes;

import algoritmos.metodos_auxiliares;


public class Teste {

    public static void main(String[] args) {
        int n = 8;
        int maiorPot = metodos_auxiliares.maiorPotencia2(n);
        int menorPot = metodos_auxiliares.menorPotencia2(n);
        System.out.println("Maior potência = " + maiorPot);
        System.out.println("Menor potência = " + menorPot);
        
        double d = 0.33;
        
        System.out.println(metodos_auxiliares.converter_para_fracao(d));
    }
    
}
