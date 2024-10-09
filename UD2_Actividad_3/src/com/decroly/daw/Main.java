package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		//ejercicio 1
		
		
		
		
		
		//ejercicio 2
		
		
		String opcion = "";
		
				
		do{
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
