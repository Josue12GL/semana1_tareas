/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euro.a.quetzal;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class EuroAQuetzal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float euro = 8.60f;
       float quetzal;
       float conversion;
       
        System.out.println("Escriba la cantidad de quetzales que quiere convertir en euro: ");
        Scanner sc = new Scanner(System.in);
        quetzal = sc.nextFloat();
       
        conversion = quetzal / euro;
        
        System.out.println("Los quetzales que ha convertido a euro son: "+conversion);
       
    }
    
}
