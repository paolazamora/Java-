package programa2a;

import java.util.Scanner;

public class Programa03 {
public String nombre;
public int edad;
public double altura;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.print("ingresa tu nombre:");
		String nombre;
		nombre =leer.nextLine();
		System.out.print("ingresa tu edad:");
		String edad;
		edad = leer.nextLine();
		System.out.print("ingresa tu altura:");
		String altura;
		altura =leer.nextLine();
		
		System.out.println("Hola"  +   nombre +  edad    + altura);
		
	}
	}


