/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerVeterinario;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class Veterinario {

    public static void main(String[] args) {
        
        int numAnimales = Utilidades.pedirNumeroAnimales();
        String[] nombresAnimales = Utilidades.pedirNombreAnimal(numAnimales);
        String[] tiposAnimales = Utilidades.pedirTipoAnimal(numAnimales);
        double[] pesosAnimales = Utilidades.pedirPesoAnimal(numAnimales);
        String[] datosAnimales = Utilidades.mostrarDatosAnimales(numAnimales,nombresAnimales, tiposAnimales, pesosAnimales);
        
        for (int i = 0; i < numAnimales; i++) {
            System.out.println(datosAnimales[i]);
        }
        
        
    }
    
}
