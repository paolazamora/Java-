package programa2a;
import java.text.DecimalFormat;
import java.util.Scanner;

public class prograna10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=1;
		double total=0.0,pd=0.0;
		byte i =0, numero =0;
		
		Scanner leer=new Scanner(System.in);
		DecimalFormat formateador = new DecimalFormat("###,##.##");
		
			System.out.println("INGRESE EL NUMERO DE PRODUCTOS" );
			numero=leer.nextByte();
			i++;
			do{
			
			System.out.println("ingrese el vallor del producto " );
			pd=leer.nextDouble();
			total+=pd;

		}
		while (i<=numero);
		if (total>=1500){
		total=total*1.11;

			
	}
           else {
			    total=total*1.10;
			
				System.out.println(total);
			}
		{
		}
	}

}
