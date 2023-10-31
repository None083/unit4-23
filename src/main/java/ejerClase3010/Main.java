/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerClase3010;

/**
 *
 * @author noelia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean[] arrayBuleanos = Utilidades.arrayBuleanos(2_000);
        
        Utilidades.rellenarArrayBuleanos(arrayBuleanos);
        
        for (int i = 0; i < arrayBuleanos.length; i++) {
            System.out.println(arrayBuleanos[i]);
        }
        
        Utilidades.mostrarNumeroCaraCruz(arrayBuleanos);
        
        

//        String[] arrayCaraCruz = Utilidades.caraCruz(arrayBuleanos);
        
//        for (int i = 0; i < arrayCaraCruz.length; i++) {
//            System.out.println(arrayCaraCruz[i]);
//        }

    }
    
}
