package Taller_4_package;

import java.util.Scanner;
public class Taller_4_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clasificacion = 0;
        double notaMedia = 0;
        int puntuacionSAT = 0;

        System.out.println("Ingrese la clasificación del estudiante en su instituto: ");
        clasificacion = sc.nextInt();

        System.out.println("Ingrese la nota media del estudiante: ");
        notaMedia = sc.nextDouble();

        System.out.println("Ingrese la puntuación SAT del estudiante: ");
        puntuacionSAT = sc.nextInt();

        if (clasificacion == 1 || clasificacion == 2) {
            System.out.println("El estudiante cumple con los requisitos para entrar en la Universidad de Mountville.");
        } else if (notaMedia >= 4.0 && puntuacionSAT >= 1100) {
            System.out.println("El estudiante cumple con los requisitos para entrar en la Universidad de Mountville.");
        } else if (notaMedia >= 3.5 && puntuacionSAT >= 1300) {
            System.out.println("El estudiante cumple con los requisitos para entrar en la Universidad de Mountville.");
        } else if (notaMedia >= 3.0 && puntuacionSAT >= 1500) {
            System.out.println("El estudiante cumple con los requisitos para entrar en la Universidad de Mountville.");
        } else {
            System.out.println("El estudiante no cumple con los requisitos para entrar en la Universidad de Mountville.");
        }

        sc.close();
    }
}