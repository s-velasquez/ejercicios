package ejercicio6;
import java.util.Scanner;
public class ejercicio6 {

	public static void main(String[] args) {
     String nombre;
     int sueldo=0;
     System.out.println("Ingrese su nombre: ");
     Scanner  a= new Scanner(System.in);
	 nombre = a.next();
	 System.out.println("Ingrese su sueldo: ");
     Scanner  b= new Scanner(System.in);
	 sueldo = b.nextInt();
	 System.out.println("Bienvenido:"+nombre);
	 System.out.println("Sueldo:"+sueldo);
	 if (sueldo<=3000)
		 
	 System.out.println("No debe pagar impuestos");
	 else 
		 System.out.println("Debe pagar impuestos");

	}

}
