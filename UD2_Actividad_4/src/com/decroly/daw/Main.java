package com.decroly.daw;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		//ejercicio1
		
		double[] nums = new double[10];
		int i;
		
		System.out.println("Introduce 10 numeros reales");
		
		for(i = 0; i < nums.length; i++)
			nums[i] = reader.nextDouble();
		
		System.out.println("Los numeros introducidos son: ");
		
		for(i = 0; i < nums.length; i++)
			System.out.println(nums[i]+ "");
		
		//ejercicio 2
		reader = new Scanner(System.in);
		
		double[] vector = new double[10];
		int u;
		
		double suma = 0;
		
		System.out.println("Introduce 10 numeros reales");
		
		for(u = 0; u < vector.length; u++)
			vector[u] = reader.nextDouble();
		
		System.out.println("La suma de todos los valores son: ");
		
		for(u = 0; u < vector.length; u++)
			vector[u] = reader.nextDouble();
		
		
	}//

}//
