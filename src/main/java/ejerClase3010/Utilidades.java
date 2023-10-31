/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerClase3010;

import java.util.Random;

/**
 *
 * @author noelia
 * 
 * -Método que devuelva un array de 2 millones de posiciones de tipo boolean
 * 
 * -En cada posición guarda cara/cruz
 * 
 * -Método que recibe un array de booleanos y muestre por pantalla el nº de caras
 * y el número de cruces que contiene
 * 
 * 
 */
public class Utilidades {
    
    public static boolean[] arrayBuleanos(int tamanyo) {
        boolean[] arrayB = new boolean[tamanyo];
        
        return arrayB;
    }
    
    public static boolean[] rellenarArrayBuleanos(boolean[] arrayBuleanos){
        Random random = new Random();
        for (int i = 0; i < arrayBuleanos.length; i++) {
            arrayBuleanos[i] = random.nextBoolean();
        }
        return arrayBuleanos;
    }
    
    public static void mostrarNumeroCaraCruz(boolean[] arrayBuleanos){
        int numeroCara = 0;
        int numeroCruz = 0;
        for (int i = 0; i < arrayBuleanos.length; i++) {
            if(arrayBuleanos[i]){
                numeroCara++;
            }else{
                numeroCruz++;
            }
        }
        System.out.println("El número de caras es: " + numeroCara);
        System.out.println("El número de cruces es: " + numeroCruz);
    }
    
    //Se reyena un array de string con cara o cruz en base al array de buleanos
    public static String[] caraCruz(boolean[] arrayBuleanos) {
        
        String[] caraCruz = new String[arrayBuleanos.length];
        
        for (int i = 0; i < arrayBuleanos.length; i++) {
            if (arrayBuleanos[i]) {
                caraCruz[i] = "cara";
            }else{
                caraCruz[i] = "cruz";
            }
        }
        return caraCruz;
    }
    
}
