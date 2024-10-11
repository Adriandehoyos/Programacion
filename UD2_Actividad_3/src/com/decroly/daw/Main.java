package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		//ejercicio 1
		
		int quinientos = 0;
		int doscientos =0;
		int cien = 0;
		int cincuenta = 0;
		int veinte = 0;
		int diez = 0;
		int cinco =0;
		
		System.out.println("Introduce la cantidad de dinero: ");
		int dinero = reader.nextInt();
		
		if (dinero % 5 != 0) {
            System.out.println("La cantidad debe ser un múltiplo de 5.");  
		}
		int resto = dinero;
		
		  if (resto >= 500) {
	            quinientos = resto / 500;
	            resto = resto % 500;
	            System.out.println(quinientos + " billete(s) de 500€");
	        }
	        
	        
	        if (resto >= 200) {
	            doscientos = resto / 200;
	            resto = resto % 200;
	            System.out.println(doscientos + " billete(s) de 200€");
	        }

	        
	        if (resto >= 100) {
	            cien = resto / 100;
	            resto = resto % 100;
	            System.out.println(cien + " billete(s) de 100€");
	        }

	        
	        if (resto >= 50) {
	            cincuenta = resto / 50;
	            resto = resto % 50;
	            System.out.println(cincuenta + " billete(s) de 50€");
	        }

	       
	        if (resto >= 20) {
	            veinte = resto / 20;
	            resto = resto % 20;
	            System.out.println(veinte + " billete(s) de 20€");
	        }

	        
	        if (resto >= 10) {
	           diez = resto / 10;
	            resto = resto % 10;
	            System.out.println(diez + " billete(s) de 10€");
	        }

	        
	        if (resto >= 5) {
	            cinco = resto / 5;
	            resto = resto % 5;
	            System.out.println(cinco + " billete(s) de 5€");
	        }
		
		
		
		
		//ejercicio 2
		
		
		String opcion = "";
		
				
		do{
			reader = new Scanner(System.in);
			
			
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            opcion = reader.nextLine();
            
	            
	            if(opcion.equals("1")){
	            	reader = new Scanner(System.in);
	            	
	            	System.out.println("Introduce un numero:  ");
	            	double suma1 = reader.nextDouble();
	            	System.out.println("Introduce un numero:  ");
	            	double suma2 = reader.nextDouble();
	            	System.out.println("La suma es: " + (suma1 + suma2));
	            	 
	            }
	            else if(opcion.equals("2")) {
	            	reader = new Scanner(System.in);
	            	
	            	System.out.println("Introduce un numero:  ");
	            	double resta1 = reader.nextDouble();
	            	System.out.println("Introduce un numero:  ");
	            	double resta2  = reader.nextDouble();
	            	System.out.println("La resta es: " + ("La resta es: "+ (resta1 - resta2)));
	            	 
	            }
	        
	            else if(opcion.equals("3")){
	            	reader = new Scanner(System.in);
	            	
	            	System.out.println("Introduce un numero:  ");
	            	double multi1 = reader.nextDouble();
	            	System.out.println("Introduce un numero:  ");
	            	double multi2 = reader.nextDouble();
	            	System.out.println("La multiplicacion es: " + (multi1 * multi2));
	            	 	
	            }
	            
	            else if(opcion.equals("4")){
	            	reader = new Scanner(System.in);
	            	
	            	System.out.println("Introduce un numero:  ");
	            	double divi1 = reader.nextDouble();
	            	System.out.println("Introduce un numero:  ");
	            	double divi2 = reader.nextDouble();
	            	System.out.println("La division es: " + (divi1 / divi2));
	            	 
	
	            }
	            else if(opcion.equals("5")){
	            	reader = new Scanner(System.in);
	                System.out.println("Saliendo del programa. Hasta pronto");
	                
	            }
	            else{
	            	System.out.println("Selecciona una opcion valida");
	            }	

        }while(!opcion.equals("5"));
		
		
		
		
		
		
		
	}//

}//
