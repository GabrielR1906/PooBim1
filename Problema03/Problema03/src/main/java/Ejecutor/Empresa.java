/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;

/**
 *
 * @author Gabriel
 */
public class Empresa {
    private String nombre;
    private String ruc;
    private String direccionAsignada;
    
    public Empresa(){
        nombre = "";
        ruc = "";
        direccionAsignada = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String r) {
        ruc = r;
    }

    public String getDireccionAsignada() {
        return direccionAsignada;
    }

    public void setDireccionAsignada(String direccionA) {
        direccionAsignada = direccionA;
    }
    
}
