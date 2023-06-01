/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejecutor;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        int empleados;
        String ruc;
        String direccion;
        String nombreDepartamento;
        int produccionAnual;
        
        Empresa e = new Empresa();
        Departamento d = new Departamento();
        
        System.out.println("Ingrese el nombre de la emrpesa:");
        nombre = entrada.nextLine();
        e.setNombre(nombre);
        
        System.out.println("Ingrese el ruc de la emrpesa:");
        ruc = entrada.nextLine();
        e.setRuc(ruc);
        
        System.out.println("Ingrese la Direccion Asiganda:");
        direccion = entrada.nextLine();
        e.setDireccionAsignada(direccion);
        
        System.out.println("Ingrese el nombre del departamento:");
        nombreDepartamento = entrada.nextLine();
        d.setNombre(nombreDepartamento);
        
        System.out.println("Ingrese el numero de empleados:");
        empleados = entrada.nextInt();
        d.setNumeroEmpleados(empleados);
        
        System.out.println("Ingrese el valor de la produccion Anual:");
        produccionAnual = entrada.nextInt();
        d.setProduccionAnual(produccionAnual);
        
        
        System.out.printf("\nDatos de la empresa:\nNombre de la empresa: %s"
                + "\nRuc de la empresa: %s\nDireccion de la empresa: %s"
                + "\nNombre del departamento: %s\nNumero de empleados: %d"
                + "\nEl valor de la produccion anual es: %d\n"
                + "La categoria del departamento es: %s",
                e.getNombre(), e.getRuc(), e.getDireccionAsignada(),
                d.getNombre(), d.getNumeroEmpleados(), d.getProduccionAnual(),
                d.obtenerCategoria());
    }
}
