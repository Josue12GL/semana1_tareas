/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.a4;

import java.util.Scanner;

public class EjercicioA4 {

    public static void main(String[] args) {
        	
		try {
			float euro;
			int divisa;
			Scanner sc = new Scanner(System.in);
			System.out.println("Ingrese la cantidad de monedas en euros");
			euro=sc.nextFloat();
			System.out.println("Escriba el tipo de divisa a utilizar");
			System.out.println("1) libras, 2) dolares, 3) yenes");
			divisa=sc.nextInt();
			conversion(euro, divisa);
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("Debe ingresar un numero");
		}

	}
	
	
	public static double conversion(float euro, int divisa) {
		double resultado=0;
		boolean correcto=true;
		switch (divisa) {
		case 1:
			resultado= euro*0.86;
			break;
		case 2:
			resultado= euro*1.28611;
			break;
		case 3:
			resultado= euro*129.852;
			break;
		default:
			correcto= false;
			break;
		}
		
		
		
		if (correcto) {
			System.out.println(euro + " Euros convertidos a " + divisa + " son " + resultado +" ");
		}else {
			System.out.println("el tipo de divisa es incorrecto, debe escribir la palabra ");
			System.out.println("libra o  dolar o yenes");
			
		}
		
		return 0;
	}

}
        // TODO code application logic here
    
    

