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
		
		*/
		//ejercicio 9
		
		reader = new Scanner(System.in);
		
		int horas;
		int mins;
		int segun;
		
		System.out.println("Introduce las Horas: ");
		horas = reader.nextInt();
		
		System.out.println("Introduce los minutos: ");
		mins = reader.nextInt();
		
		System.out.println("Introduce los segundos: ");
		segun = reader.nextInt();
		
		
		
	}//

}//
