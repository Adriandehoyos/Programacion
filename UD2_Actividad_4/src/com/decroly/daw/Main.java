package com.decroly.daw;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
	/*	
		//ejercicio1
		
		double[] nums = new double[10];
		
		
		System.out.println("Introduce 10 numeros reales");
		
		for(int i = 0; i < nums.length; i++)
			nums[i] = reader.nextDouble();
		
		System.out.println("Los numeros introducidos son: ");
		
		for(int i = 0; i < nums.length; i++)
			System.out.println(nums[i]+ "");
		
		//ejercicio 2
		reader = new Scanner(System.in);
		
		double[] vector = new double[10];
		
		
		double suma = 0.0;
		
		System.out.println("Introduce 10 numeros reales");
		
		for(int u = 0; u < vector.length; u++)
			vector[u] = reader.nextDouble();
		
		for(int u = 0; u < vector.length; u++) {
			
			suma += vector[u];
		}
		
		System.out.println("La suma de todos los valores son:"+suma);

		//ejercicio 3
		
		reader = new Scanner(System.in);
		
		double[] vector1 = new double[10];
		
		
		
		System.out.println("Introduce 10 numeros reales");
		
		for(int i = 0; i < vector1.length; i++)
			vector1[i] = reader.nextDouble();
		
		double maximo = 0.0;
		double minimo = vector1[0];
		
		
		for(i = 0; i < vector1.length; i++) {
					
			maximo= Math.max(vector1[i], maximo);
			minimo= Math.min(vector1[i], minimo);
		}
		
		System.out.println("El numero máximo es: "+ maximo);
		System.out.println("El numero minimo es: " + minimo);
	

		//ejercicio 4
		
		reader = new Scanner(System.in);
				
		int[] vector2 = new int[20];

		
				
		System.out.println("Introduce 20 numeros reales");
		int sumaNega = 0;
		int sumaPosi = 0;
				
		for(int i = 0; i < vector2.length; i++) {
			vector2[i] = reader.nextInt();
				

			
			if(vector2[i] > 0) {
				sumaPosi += vector2[i];
			}else if(vector2[i]< 0) {
				sumaNega += vector2[i];
			}
		
		}
		System.out.println("La suma de los numeros positivos es: "+ sumaPosi);
		System.out.println("La suma de los numeros negativos es: "+ sumaNega);
		
		
		//ejercicio 5

		reader = new Scanner(System.in);
		
		double[] vector3 = new double[20];

		System.out.println("Introduce 20 numeros reales");	

		double sumamedia = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < vector3.length; i++) {
			vector3[i] = reader.nextDouble();
			
			sumamedia += vector3[i];
			media = sumamedia/20;
			
		}
		
		System.out.println("La media de los valores introducidos es:" + media);



		//ejercicio 6

		reader = new Scanner(System.in);
		
		System.out.println("Dame un valor N");
		int n = reader.nextInt();
		
		System.out.println("Dame un valor M");
		int m = reader.nextInt();
		
		int vector4[] = new int[n];
		
		for(int i = 0; i < n; i++)
			vector4[i] = m;
			
		System.out.println("el resultado del array es: ");

		for(int i = 0; i < n; i++)
			System.out.println(vector4[i]+ "");
		
*/		
		//ejercicio 7
		
		reader = new Scanner(System.in);
				
		System.out.println("Dame un valor P");
		int P = reader.nextInt();
				
		System.out.println("Dame un valor Q");
		int Q = reader.nextInt();
		
		if(P>Q) {
			System.out.println("El valor P tiene que ser menor que Q");
		}else {
			int array = Q - P;
			int vector[] = new int[array];
			for(int i = 0; i < vector.length; i++)
				//sin acabar
			
		System.out.println("El array de la diferencia de P y Q es: ");	
			for(int i = 0; i < vector.length; i++)
				System.out.println(vector[i]+ "");
		}
		
		
	}//

}//
