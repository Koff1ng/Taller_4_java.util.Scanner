package Taller_4_package;

import java.util.Scanner;

public class Taller_4_Ejercicio_6{
    public static void main(String[] args){
        double promedio;
        int diasFaltados;
        boolean exento=false;
        Scanner reader= new Scanner(System.in);

        System.out.println("Este programa determinará si puedes salir exento del examen final.");
        System.out.println("Por favor responde las siguientes preguntas.");

        System.out.println("¿Cuál es tu promedio en la clase?");
        promedio=reader.nextDouble();

        System.out.println("¿Cuántas clases has faltado?");
        diasFaltados=reader.nextInt();

        if(promedio>=90 && diasFaltados<=3 || promedio>=80 && diasFaltados==0)
            System.out.println("¡Felicitaciones! Estás exento del examen final.");
        else
            System.out.println("No estás exento del examen final.");
    }
}