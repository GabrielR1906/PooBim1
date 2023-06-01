/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.problema04;

/**
 *
 * @author renat
 */
public class Primos {
    int d = 2;
    public int obtenerPrimos(int n){

        while(d <= n/2){
            if(n%d == 0){
                return 0;
            }
            d++;
        }
        return n;
    }
}
