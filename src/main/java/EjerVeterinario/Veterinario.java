/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerVeterinario;


/**
 *
 * @author noelia
 */
public class Veterinario {

    public static void main(String[] args) {

        int numAnimales = Utilidades.pedirNumeroAnimales();
        String[] nombresAnimales = Utilidades.pedirNombreAnimal(numAnimales);
        String[] tiposAnimales = Utilidades.pedirTipoAnimal(numAnimales, nombresAnimales);
        double[] pesosAnimales = Utilidades.pedirPesoAnimal(numAnimales, nombresAnimales);
        String[] datosAnimales = Utilidades.mostrarDatosAnimales(numAnimales,
                nombresAnimales, tiposAnimales, pesosAnimales);

        for (int i = 0; i < numAnimales; i++) {
            System.out.println(datosAnimales[i]);
        }

        double mediaPeso = Utilidades.calcularMedia(pesosAnimales);
        int sobreMedia = Utilidades.numPesoEncimaMedia(mediaPeso, pesosAnimales);
        int bajoMedia = Utilidades.numPesoBajoMedia(mediaPeso, pesosAnimales);

        System.out.println("""
                           La media de peso es: %.2fkg
                           Número de animales sobre la media: %d
                           Número de animales bajo la media: %d
                           """.formatted(mediaPeso, sobreMedia, bajoMedia));

    }

}
