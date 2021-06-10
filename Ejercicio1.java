/*
   1. Solicitar al usuario que ingrese un número entero N, luego generar en forma aleatoria N números enteros comprendidos 
   entre 1 y 100 y determinar cuántos son pares y cuántos impares.
*/

import java.util.*;

public class Ejercicio1 {

	public static void main(String args[]) {

		Scanner read = new Scanner(System.in);
		Random random = new Random();

		int N, pares=0, impares=0, numAleatorio;

		System.out.print("\nIngrese un numero: ");
		N = read.nextInt();

		for (int i=1;i<=N;i++) {
			numAleatorio = random.nextInt(100)+1;

			System.out.println(" - "+numAleatorio+" - ");
			if (numAleatorio%2==0) {
				pares ++;
			} else {
				impares ++;
			}
		}

		System.out.println("\n   Total de numeros pares: "+pares);
		System.out.println("   Total de numeros impares: "+impares+"\n");

	}


}

