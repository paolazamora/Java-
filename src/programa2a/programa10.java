package programa2a;
import java.util.Scanner;
import java.text.DecimalFormat;
public class programa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner leer = new Scanner(System.in);
  DecimalFormat formateador=new DecimalFormat("###,###.##");
  double producto1=0, producto2=0,producto3=0,total=0;
  
  System.out.println("Bienvenido a la tienda de 3 productos,");
  System.out.println("Que deseas llevar?");
  System.out.println("ingrese el precio del primer producto");
 producto1 = leer.nextDouble();
 
  System.out.println("ingrese el precio del segundo producto");
  producto2 = leer.nextDouble();
  System.out.println("ingrese el precio del tercer producto");
  producto2 = leer.nextDouble();
  
	total = producto1+producto2+producto3;
	
	if(total>=1500){
		
	}
	else{
		total = total*1.16;
		
	}
	System.out.println("El total seria: $"+ formateador.format(total));
	 
	}

}
