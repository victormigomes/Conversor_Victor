/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Conversor {
    double c, f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        
        //apresentação
        System.out.println("Conversor 1.0");
        
        System.out.println("\nConverta temperaturas em Celsius para Fahrenheit utilizando a fórmula ºF = ºC * 9 / 5 + 32");
        
        //entrada
        System.out.print("\nDigite a temperatura em ºC: ");
        double c = dados.nextInt();
        
        //processamento
        double f = c * 9 / 5 + 32;
        
        //saída de informações
        System.out.println("\nO resultado em Fahrenheit é " + f + "ºF");
    }

}
