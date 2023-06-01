/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.problema04;

/**
 *
 * @author renat
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numerosPrimos = new int[10];
        Primos pr = new Primos();
        int n = 1;
        for (int i = 0; i < numerosPrimos.length; i++) {
            if (pr.obtenerPrimos(n) == 0){
                n++;
            }
            if (pr.obtenerPrimos(n) != 0){
                numerosPrimos[i] = pr.obtenerPrimos(n);
            }
            n++;
        }
        
        for (int i = 0; i < numerosPrimos.length; i++) {
            System.out.print(numerosPrimos[i] + "\t");
        }
    }
}
