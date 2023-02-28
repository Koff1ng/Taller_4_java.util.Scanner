package Taller_4_package;
import java.util.Scanner;

public class Taller_4_Ejercicio_1 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ingrese un dato para comparar: ");
		
		String x = sc.next();
		int dato = Integer.parseInt(x);
	    boolean condicionalTernario = dato <= 7 ? true:false;
	    
	    System.out.println(condicionalTernario);

	}


}
