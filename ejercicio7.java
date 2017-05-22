package ejercicio7;
import java.util.Scanner;
public class ejercicio7 {
	private int a, b;
	private int suma, resta, multi, div;
	private Scanner c;
	private Scanner d;
	public void ingresar(){
		System.out.println("ingrese un numero: ");
		Scanner c=new Scanner(System.in); 
		a =c.nextInt();
		System.out.println("ingrese otro numero: ");
		Scanner d=new Scanner(System.in); 
		b =d.nextInt();
		
	}
	public void operaciones(){
		suma=a+b;
		resta=a-b;
		multi=a*b;
		div=a/b;
		
		System.out.println("La suma de los valores: "+suma);
		System.out.println("La resta de los valores: "+resta);
		System.out.println("La multiplicacion de los valores: "+multi);
		System.out.println("La division de los valores: "+div);
	 
		}
	
	public static void main(String[] args) {
		ejercicio7 ejercicio7;
		ejercicio7=new ejercicio7();
		ejercicio7.ingresar();
		ejercicio7.operaciones();
		
	}
}
