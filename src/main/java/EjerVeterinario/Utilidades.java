/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerVeterinario;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author noelia
 *
 * Pedir al usuario un número de animales que van a ser evaluados en el
 * veterinario. De cada animal vamos a guardar su peso, que vamos a pedir por
 * teclado. Una vez sepamos los pesos de todos los animales, queremos saber la
 * media de todos los pesos, cuantos animales hay por debajo de la media y
 * cuantos por encima.
 *
 * Si el suuario pone un peso negativo se considerará positivo.
 *
 * Método que diga por cada perro cuanto pesa
 *
 *
 */
public class Utilidades {

    public static int pedirNumeroAnimales() {
        Scanner teclado = new Scanner(System.in);
        int numeroAnimales = 0;
        boolean errorMismatch = true;
        do {
            try {
                System.out.println("¿Cuántos animales se van a pesar?");
                numeroAnimales = teclado.nextInt();
                errorMismatch = false;
            } catch (InputMismatchException ime) {
                System.out.println("Eso no es un número");
            }
            teclado.nextLine();
        } while (errorMismatch);

        return numeroAnimales;
    }

    public static String[] pedirNombreAnimal(int numAnimales) {

        Scanner teclado = new Scanner(System.in);

        String[] arrayNombres = new String[numAnimales];

        for (int i = 0; i < numAnimales; i++) {
            System.out.println("Introduce el nombre del animal Nº" + (i + 1));
            arrayNombres[i] = teclado.nextLine();
        }
        return arrayNombres;
    }

    public static String[] pedirTipoAnimal(int numAnimales, String[] nombre) {

        Scanner teclado = new Scanner(System.in);

        String[] arrayTipoAnimal = new String[numAnimales];

        for (int i = 0; i < numAnimales; i++) {
            System.out.println("¿Qué tipo de animal es " + nombre[i] + "?");
            arrayTipoAnimal[i] = teclado.nextLine();
        }
        return arrayTipoAnimal;
    }

    public static double[] pedirPesoAnimal(int numAnimales, String[] nombre) {

        Scanner teclado = new Scanner(System.in);
        boolean errorMismatch;
        double[] arrayPesos = new double[numAnimales];

        for (int i = 0; i < numAnimales; i++) {
            do {
                errorMismatch = false;
                try {
                    System.out.println("¿Cuál es el peso de " + nombre[i] + "?");
                    arrayPesos[i] = teclado.nextDouble();
                    
                } catch (InputMismatchException ime) {
                    teclado.nextLine();
                    System.out.println("Debes introducir un número, "
                            + "recuerda que los decimales van con , (coma)");
                    errorMismatch = true;
                }
                
            } while (errorMismatch);

        }
        return arrayPesos;
    }

    public static String[] mostrarDatosAnimales(int numAnimales, String[] nombre, String[] tipo, double[] peso) {

        String[] datos = new String[numAnimales];

        for (int i = 0; i < numAnimales; i++) {
            datos[i] = "Datos del animal Nº" + (i + 1) + " Nombre: %s, Tipo: %s, Peso: %.2fkg"
                    .formatted(nombre[i], tipo[i], peso[i]);
        }
        return datos;
    }

    public static double calcularMedia(double[] pesos) {
        double sumaPesos = 0;
        for (int i = 0; i < pesos.length; i++) {
            sumaPesos += pesos[i];
        }
        double mediaPesos = sumaPesos / pesos.length;
        return mediaPesos;
    }

    public static int numPesoEncimaMedia(double mediaPeso, double[] pesos) {
        int contador = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > mediaPeso) {
                contador++;
            }
        }
        return contador;
    }

    public static int numPesoBajoMedia(double mediaPeso, double[] pesos) {
        int contador = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] < mediaPeso) {
                contador++;
            }
        }
        return contador;
    }

}
