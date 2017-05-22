package ejercicio5;
import java.util.Scanner;
public class ejercicio5 {
	public static void main(String[] args) {
		int b, suma;
		suma=0;
		do{
			System.out.println("ingrese valor de producto: ");
			Scanner a= new Scanner(System.in);
			b = a.nextInt();
			
			if (b!=9999){
				suma = suma + b;
			}
		}
		while (b!=9999);
	
		System.out.println(suma);

	}
}


