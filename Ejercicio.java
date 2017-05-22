
package ejercicio1;
import java.util.Scanner;
public class Ejercicio {

	public static void main(String[] args) {
	   double i;
	   int c;
	   
		Scanner a= new Scanner(System.in);
		Scanner b= new Scanner(System.in);
		System.out.println("ingrese el precio: ");
	
		 i = a.nextInt();
		
		 System.out.println("ingrese la cantidad: ");
		 c = b.nextInt();
		 
		 System.out.println("El valor es: "+i*c);
		
		

	}

}
