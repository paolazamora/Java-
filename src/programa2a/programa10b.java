package programa2a;

import java.text.DecimalFormat;
import java.util.Scanner;

public class programa10b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("###,##.##");
  byte num =0, i =0;
  int suma=0, p=1;
  double t=0;
  
  do{
    System.out.println("ingrese numero del 0 al 76(que no sea mayor a 76) :");
    num =leer.nextByte();
    if(num >=0 && num <=76)
    suma+=num;
    i++;
  
     
    }while(num<=76);
    t=suma/p;
    System.out.println("la suma total es " +suma+formateador.format(suma));
    System.out.println("el promedio es" + t);
		
	}

}
