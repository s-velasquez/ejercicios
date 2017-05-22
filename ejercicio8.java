package ejercicio8;
import java.util.Scanner; 
public class ejercicio8 {

	private String nombre, apellido;
	private int edad;
	private double sueldo;
	private Scanner c;
	private Scanner b;
	private Scanner w;
	private Scanner v;
	
		public void persona(){
		System.out.println("Por favor ingrese su nombre: ");
		Scanner c=new Scanner(System.in);
		nombre= c.nextLine();
		
		System.out.println("por favor ingrese su apellido: ");
		Scanner v=new Scanner(System.in);
		apellido= v.nextLine();
		
		System.out.println("por favor ingrese su edad: ");
		Scanner b=new Scanner(System.in);
		edad= b.nextInt();
		
		System.out.println("por favor ingrese su sueldo: ");
		Scanner w=new Scanner(System.in);
		sueldo= w.nextInt();
		
	}
		public void empleado(){
		
			System.out.println("Nombre:"+nombre);
			System.out.println("Apellido:"+apellido);
			System.out.println("Edad:"+edad);
			System.out.println("Sueldo:$"+sueldo);
		}
	
	public static void main(String[] args) {
		ejercicio8 ejercicio8;
		ejercicio8= new ejercicio8();
		ejercicio8.persona();
		ejercicio8.empleado();
		

	}

}

