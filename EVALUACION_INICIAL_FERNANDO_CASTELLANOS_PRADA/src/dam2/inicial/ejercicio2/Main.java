package dam2.inicial.ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList <Integer> valores = new ArrayList <Integer>();
		
		int opcion = 0;
		Scanner sc = new Scanner (System.in);
		
		
		do {
			
			opcion = sc.nextInt();
			valores.add(opcion);
			
		} while (opcion != -1);
		
		valores.remove(valores.size()-1);
		
		int suma = 0;
		int contador = 0;
		for (int i = 0; i<valores.size();i++) {
			suma = suma + valores.get(i);
			contador++;
		}
		
		double media = suma/contador;
		
		System.out.println("Se han leído "+contador+" numeros que suman "+suma);
		System.out.println("La media es "+media+" los numeros leidos son "+valores.toString());
		int contador2 = 0;
		for (int i = 0; i<valores.size();i++) {
			int numero = valores.get(i);
			if (numero > media) {
				contador2++;
			}
		}
		System.out.println("Hay "+contador2+" por encima de la media");
		

	}

}
