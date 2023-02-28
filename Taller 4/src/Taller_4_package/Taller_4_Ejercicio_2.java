package Taller_4_package;
import java.util.Scanner;
public class Taller_4_Ejercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero 1: ");
		double ingreso1 = sc.nextDouble();
	
		System.out.println("Ingrese numero 2: ");
		double ingreso2 = sc.nextDouble();
		
	    System.out.println("Ingrese su operador: ");
	    String operador = sc.next();
	    
	    double resultado = 0;
	    
	    switch(operador) {
	    	case "-": resultado = ingreso1 - ingreso2;
	    	break;
	    	case "*": resultado = ingreso1 * ingreso2;
	    	break;
	    	case "+": resultado = ingreso1 + ingreso2;
	    	break;
	    	case "/": resultado = ingreso1 / ingreso2;
	    	break;
	    	case "%": resultado = ingreso1 % ingreso2;
	    	break;
	    	default: 
	    		System.out.println("Operador invalido");
	    		return;
	    }
	    	
	    System.out.println(resultado);
		
		
		
		
		
	
		

	}

}

