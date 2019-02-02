package programa2a;
import java.util.Scanner;
public class Programa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  byte opcion;
 Scanner leer= new Scanner(System.in);
 System.out.println ("ingrese un numero del 1-7");
 opcion = leer.nextByte();
  switch (opcion){
  case 1: System.out.println  ("Lunes");
  break;
  case 2: System.out.println ("Martes");
  break;
  case 3:System.out.println  ("Miercoles");
  break;
  case 4:System.out.println ( "jueves");
  break;
  case 5: System.out.println("Viernes");
  break;
  case 6:System.out.println ( "Sabado");
  break;
  case 7:System.out.println ("Domingo");
  
  default: System.out.println ("Dia invalido");
  break;
 
  }
  
	}

}
