package ejercicio2;

import java.util.Scanner;

public class ejercicio2 {
	public static void main(String[] args) {
	   int i;
	   
		Scanner a= new Scanner(System.in);
	
		System.out.println("ingrese numero positivo: ");
	      i = a.nextInt();
		if (i<9)
			System.out.println("el numero contiene un digito");
		else if (i<99)
			System.out.println("el numero contiene dos digitos");
		else
			System.out.println("el numero contiene tres digitos");
		 
		 
		
   }
}