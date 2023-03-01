package Taller_4_package;

import java.util.Scanner;

public class Taller_4_Ejercicio_7 {

    public static void main(String[] args) {
        final int PIES_CUADRADOS_POR_BOTE_GRANDE = 1500;
        final int PIES_CUADRADOS_POR_BOTE_PEQUENO = 300;
        final int PRECIO_BOTE_GRANDE = 15;
        final int PRECIO_BOTE_PEQUENO = 4;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la altura de la habitación en pies:");
        double altura = sc.nextDouble();

        System.out.println("Ingrese el largo de la habitación en pies:");
        double largo = sc.nextDouble();

        System.out.println("Ingrese el ancho de la habitación en pies:");
        double ancho = sc.nextDouble();

        double areaTotal = 2 * altura * largo + 2 * altura * ancho;
        double areaTecho = largo * ancho;
        double areaParedes = areaTotal - areaTecho;

        int botesGrandesNecesarios = (int) Math.ceil(areaTotal / PIES_CUADRADOS_POR_BOTE_GRANDE);
        int botesPequenosNecesarios = (int) Math.ceil(areaParedes / PIES_CUADRADOS_POR_BOTE_PEQUENO);

        int botesGrandesOptimos = (int) Math.ceil(areaTotal / PIES_CUADRADOS_POR_BOTE_GRANDE);
        int botesPequenosOptimos = (int) Math.ceil(areaTecho / PIES_CUADRADOS_POR_BOTE_PEQUENO);

        int costoBotesGrandes = botesGrandesNecesarios * PRECIO_BOTE_GRANDE;
        int costoBotesPequenos = botesPequenosNecesarios * PRECIO_BOTE_PEQUENO;
        int costoTotal = costoBotesGrandes + costoBotesPequenos;

        System.out.println("Para pintar la habitación necesitará:");
        System.out.println(botesGrandesNecesarios + " botes de pintura grande.");
        System.out.println(botesPequenosNecesarios + " botes de pintura pequeña.");

        System.out.println("Para pintar la habitación de forma óptima debería comprar:");
        System.out.println(botesGrandesOptimos + " botes de pintura grande.");
        System.out.println(botesPequenosOptimos + " botes de pintura pequeña.");

        System.out.println("El costo total de la pintura será de $" + costoTotal + ".");
    }
}