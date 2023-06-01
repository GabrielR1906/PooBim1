/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.problema08;

/**
 *
 * @author renat
 */
public class Problema08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo1 = new int[100];
        int[] arreglo2 = new int[100];
        Cuadrado c = new Cuadrado();
        
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = i+1;
            arreglo2[i] = c.obtenerCuadrado(arreglo1[i]);
        }
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo1[i] + "\t");
        }
        System.out.println("");
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.print(arreglo2[i] + "\t");
        }
        System.out.println("");
    }
}
