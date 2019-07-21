/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

/**
 *
 * @author USUARIOTC
 */
import java.util.Scanner;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
        System.out.println();
        for(int numBlancos = 0, numAsteriscos = (numFilas*2)-1; numAsteriscos>0; numBlancos++, numAsteriscos -= 2){
             
            //Espacios en blanco
            for(int i=0; i < numBlancos; i++){
                System.out.print(" ");
            }
             
            //Asteriscos
            for(int j=numAsteriscos; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   

        // TODO code application logic here
    }
    

