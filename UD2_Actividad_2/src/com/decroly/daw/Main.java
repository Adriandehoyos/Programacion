package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ejercicio 1
		Scanner reader = new Scanner(System.in);
	/*	System.out.println("Introduce la edad: ");
		int edad = reader.nextInt();

		if (edad>= 18)
		{
			System.out.println("Eres mayor de edad");
		}
			
		//ejercicio 2
		
		reader = new Scanner(System.in);
		System.out.println("Introduce la edad: ");
		int edad1 = reader.nextInt();

		if (edad1>= 18)
		{
			System.out.println("Eres mayor de edad");
		}
		else
		{
			System.out.println("Eres menor de edad");
		}
			
		//ejercicio 3
			
			for (int i = 1; i <= 20 ; i++) {
				System.out.println(i);
			}
			
		//ejercicio 4
			
		for (int i = 0; i <= 200 ; i+=2) {
			System.out.println(i);
		}
			
		//ejercicio 5
		
		for (int i = 1; i <= 200 ; i++) {
	
		if(i % 2== 0)	
		System.out.println("Los numeros pares:"+i);
		
		}
	
		//ejercicio 6
		
		reader = new Scanner(System.in);
		System.out.println("Introduce el numero maximo: ");
		int maximo = reader.nextInt();

		for(int i = 0; i <= maximo; i++) {
			
			System.out.println(i);
		}
		
		
		
		//ejericio 7
		
		reader = new Scanner(System.in);
		
		double nota;
		
		System.out.println("Introduce la calificacion del 1 al 10: ");
		
		nota = reader.nextDouble();
		
		if (nota < 3) {
		
			System.out.println("Muy Deficiente.");
		}else if (nota < 5) {
			
			System.out.println("insuficiente.");
		}else if (nota < 6) {
			
			System.out.println("Suficiente.");
		}else if (nota < 7) {
			
			System.out.println("Bien.");
		}else if (nota < 9) {
			
			System.out.println("Notable.");
		}else {
			System.out.println("Sobresaliente.");
		}
		
		
			
		//ejercicio 8
		
		reader = new Scanner(System.in);
		
		int N;
		int factorial = 1;
		
		System.out.println("Introduce un numero positivo: ");
		N = reader.nextInt();
		
		 for (int i = 2; i <= N; ++i) {
		      factorial *= i;
		    }
		
		if(N<0){
			
			System.out.println("Tiene que ser un numero positivo");
			
		}else {
			
			System.out.println("El factorial de "+ N +" es "+ factorial);
		}
		
		
		//ejercicio 9
		
		reader = new Scanner(System.in);
		
		
		System.out.println("Introduce las Horas: ");
		int horas = reader.nextInt();
		
		System.out.println("Introduce los minutos: ");
		int mins = reader.nextInt();
		
		System.out.println("Introduce los segundos: ");
		int segun = reader.nextInt();
		
		segun++;
		
		 if (segun == 60) {
             segun = 0;
             mins++;
         }

         if (mins == 60) {
             mins = 0;
             horas++;
         }

         if (horas == 24) {
             horas = 0;
         }
		
         System.out.println("La Hora es:"+horas+":"+mins+":"+segun );
      
         
         
         //ejercicio 10
		
		reader = new Scanner(System.in);
		
		System.out.println("Ingrese 10 números no nulos:");
		
		int contador = 0;
		int negativo = 0;
		int positivo = 0;
		
		
		while(contador < 10) {
			System.out.println("Escribe un numero:");
			int nonulo = reader.nextInt();
			
			
			if(nonulo == 0) {
				System.out.println("numero no valido");
				continue;
			}else if(nonulo<0) {
				negativo++;
				contador++;
			}else{
				positivo++;
				contador++;
			}
		}
		
		if(negativo>= 1) {
			System.out.println("Hay al menos un numero negativo");
		}else if(negativo ==0){
			System.out.println("No hay numeros negativos");
		}
		
		
		//ejercicio11
		
			reader = new Scanner(System.in);
		
				System.out.println("Ingrese 10 números no nulos:");
				
				contador = 0;
				negativo = 0;
				positivo = 0;
				
				
				while(contador < 10) {
					System.out.println("Escribe un numero:");
					int nonulo = reader.nextInt();
					
					
					if(nonulo == 0) {
						System.out.println("numero no valido");
						continue;
					}else if(nonulo<0) {
						negativo++;
						contador++;
					}else{
						positivo++;
						contador++;
					}
				}
				
				System.out.println("Has introducido "+negativo+" numeros negativos" );
				System.out.println("Has introducido "+positivo+" numeros positivos" );
		
		//ejercicio 12		
		
		reader = new Scanner(System.in);
			
		int nocero = 0;
		int positivo1= 0;
		int negativo1 = 0;		
		
			do {
				System.out.println("Introduce un numero");
				nocero = reader.nextInt();
				
				if(nocero<0) {
					negativo1++;
				}else {
					positivo1++;
				}
			}
			
			while(nocero != 0);			
			
			System.out.println("Has introducido "+negativo1+" numeros negativos" );
			System.out.println("Has introducido "+positivo1+" numeros positivos" );
		
		*/
		
		//ejercicio13
		
		System.out.println("La suma y el producto de los 10 primeros números naturales");
		
		int suma = 0;
		int producto = 1;
		
		for (int i = 1; i <= 10; i++) {
		
			suma += i;
			producto *= i;
		}
		
		System.out.println("La suma es: "+ suma);
		System.out.println("El producto es: "+ producto);
		
	}//

}//
