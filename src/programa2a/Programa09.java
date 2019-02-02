package programa2a;

import java.util.Scanner;

public class Programa09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 byte opcion;
		 double r;
		 float n;
		 Scanner leer= new Scanner(System.in);
		 System.out.println ("opciones");
		 opcion = leer.nextByte();
		
		   System.out.println  ("1.-pulgadas a centimetros");
		  
		   System.out.println ("2.-pies a centimetros");
		  
		  System.out.println  ("3.-pies a pulgadas");
		  System.out.println  ("elige opcion");
		  opcion = leer.nextByte(); 
		  
		  
		   switch (opcion){
		   case 1: System.out.println  ("ingrese la cantidad en pulgadas que va a convertir a centimetros");
		   n= leer.nextFloat();
		   r= n*2.54;
		   System.out.println("la cantidad de centimentros es: "+r);
		   break;
		   
		   case 2: System.out.println ("ingrese la cantidad en pies que va a convertir a centimetros ");
		   n= leer.nextFloat();
		   r=n*30.48;
		   System.out.println("la cantidad de centimentros es: "+r);
		   break;
		   
		   case 3:System.out.println  ("ingrese la cantidad en pies que va a convertir a pulgadas");
		   n=leer.nextFloat();
		   r=n* 12;
		   System.out.println("la cantidad de centimentros es: "+r);
		   break;
		   default: System.out.println("opcion invalida");
		   
		   }
		  
	}
}


