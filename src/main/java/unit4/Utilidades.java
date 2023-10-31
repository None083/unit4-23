/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Utilidades {

    //Método de clase público (visible por otras clases)
    //Estático (static) no necesita objetos de la clase Utilidades
    //Devuelve dato de tipo int -> return dentro del método
    //Nombre del método
    //El método no tiene parámetros
    public static int solicitarDatoInt() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        boolean seguir = true;
        int dato = 0;
        do {
            try {
                dato = teclado.nextInt();
                seguir = false;
            } catch (InputMismatchException ime) {
                System.out.println("No has introducido un número");
            }
            teclado.nextLine();
        } while (seguir);
        //Aquí ya hay un número
        //Devolución del dato
        return dato;
    }

    //Método que filtra datos enteros entre menos y mayor
    public static int filtrarEnterosEntre(int menor, int mayor) {

        int numero;
        do {
            //Para usar un método que está dentro de la propia clase
            //no es necesario poner el nombre de la clase
            numero = solicitarDatoInt();
            if (numero > mayor || numero < menor) {
                System.out.println("El número no está en el rango " + menor + " - " + mayor);
            }
        } while (!(numero > menor && numero < mayor));
        
        return numero;

    }
    
    //Método para obtener un entero aleatorio entre dos números
    public static int rnteroAleatorio(int menor, int mayor){
        Random r = new Random();
        return r.nextInt(menor, mayor+1); 
    }

}
