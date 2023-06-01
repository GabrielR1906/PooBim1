/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;

/**
 *
 * @author Gabriel
 */
public class Departamento {
    private String nombre;
    private int numeroEmpleados;
    private int produccionAnual;
    private String categoriaMerecida;

    public Departamento(){
        nombre = "";
        numeroEmpleados = 0;
        produccionAnual = 0;
        categoriaMerecida = "";
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public void setNumeroEmpleados(int numeroE) {
        numeroEmpleados = numeroE;
    }

    public int getProduccionAnual() {
        return produccionAnual;
    }

    public void setProduccionAnual(int produccionA) {
        produccionAnual = produccionA;
    }

    public String getCategoriaMerecida() {
        return categoriaMerecida;
    }

    public void setCategoriaMerecida(String categoriaM) {
        this.categoriaMerecida = categoriaM;
    }
    
    public String obtenerCategoria(){
        if ((numeroEmpleados == 10) && (produccionAnual == 500000)){
            return "A";
        } else {
            if ((numeroEmpleados == 20) && (produccionAnual == 1000000)){
                return "B";
            } else {
                if ((numeroEmpleados > 20) && (produccionAnual > 1000000)){
                    return "C";
                }
            }
        }
        return "Los valores ingresados no coinciden con"
                + " ninguna de las categorias";
    }
    
}
