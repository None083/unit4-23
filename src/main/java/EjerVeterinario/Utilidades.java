/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerVeterinario;

import java.util.Scanner;

/**
 *
 * @author noelia
 * 
 * Pedir al usuario un número de animales que van a ser evaluados en el veterinario. 
 * De cada animal vamos a guardar su peso, que vamos a pedir por teclado. 
 * Una vez sepamos los pesos de todos los animales, queremos saber la media 
 * de todos los pesos, cuantos animales hay por debajo de la media 
 * y cuantos por encima.
 * 
 * Si el suuario pone un peso negativo se considerará positivo.
 * 
 * Método que diga por cada perro cuanto pesa
 * 
 * 
 */
public class Utilidades {
    
    public static int pedirNumeroAnimales(){
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¿Cuántos animales se van a pesar?");
        return teclado.nextInt();
    }
    
    public static String[] pedirNombreAnimal(int numAnimales){
        
        Scanner teclado = new Scanner(System.in);
        
        String[] arrayNombres = new String[numAnimales];
        
        for (int i = 0; i < numAnimales; i++) {
            System.out.println("Introduce el nombre:");
            arrayNombres[i] = teclado.nextLine();
        }
        return arrayNombres;
    }
    
    public static String[] pedirTipoAnimal(int numAnimales){
        
        Scanner teclado = new Scanner(System.in);

        String[] arrayTipoAnimal = new String[numAnimales];
        
        for (int i = 0; i < numAnimales; i++) {
            System.out.println("Introduce el tipo del animal:");
            arrayTipoAnimal[i] = teclado.nextLine();
        }
        return arrayTipoAnimal;
    }
    
    public static double[] pedirPesoAnimal(int numAnimales){
        
        Scanner teclado = new Scanner(System.in);

        double[] arrayPesos = new double[numAnimales];
        
        for (int i = 0; i < numAnimales; i++) {
            System.out.println("Introduce el peso:");
            arrayPesos[i] = teclado.nextDouble();
        }
        return arrayPesos;
    }
    
    public static String[] mostrarDatosAnimales(int numAnimales, String[] nombre, String[] tipo, double[] peso){
        
        String[] datos=new String[numAnimales];
        
        for (int i = 0; i < numAnimales; i++) {
             datos[i] = "Datos del animal Nº" + (i+1) + " Nombre: %s, Tipo: %s, Peso: %.2f".formatted(nombre[i], tipo[i], peso[i]);
        }
        return datos;
    }
    
    public static double calcularMedia(){
        
    }
    
}
