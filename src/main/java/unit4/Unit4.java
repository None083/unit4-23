/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package unit4;

/**
 *
 * @author noelia
 */
public class Unit4 {

    public static void main(String[] args) {

        //Acceso a un método estático público de otra clase
        //Se usa el nombre de la clase (.) nombre del número
        int numero = Utilidades.filtrarEnterosEntre(6, 10);

        System.out.println("El número es " + numero);

        System.out.println("Vamos a crear alatorios entre dos números int");
        System.out.println("Introduce el primer número");
        int dato1 = Utilidades.solicitarDatoInt();
        System.out.println("Introduce el segundo número");
        int dato2 = Utilidades.solicitarDatoInt();

        int aleatorio = Utilidades.rnteroAleatorio(dato1, dato2);
        System.out.println(aleatorio);

        //Crear un array de 100 elementos aleatorios de tipo int
        int[] arrayAleatorios = new int[100];
        int numeroMenor = 10;
        int numeroMayor = 2_000;

        //Rellenar el array con aleatorios
        for (int i = 0; i < arrayAleatorios.length; i++) {
            arrayAleatorios[i] = Utilidades.rnteroAleatorio(numeroMenor, numeroMayor);
        }
        for (int i = 0; i < arrayAleatorios.length; i++) {
            System.out.print(" " + arrayAleatorios[i]);
        }

    }
}
