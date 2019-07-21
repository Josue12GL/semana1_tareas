/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
     
    float factura;
    float iva = 0.12f;
    float totaliva;
    float total;
        
    System.out.println("Coloca la base imponible de la factura(precio sin I.V.A.): ");
    factura = x.nextFloat();
    
    totaliva = factura * iva;
    
    total = factura + totaliva;
    
    System.out.println("El total de la factura es(I.V.A. incluido): "+total);
    
    }
    
}
