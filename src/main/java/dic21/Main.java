/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dic21;

/**
 *
 * @author noelia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente("Noelia", "uwu@gmail.com", 31, 
                "Calle uwu");
        
        Cliente c2 = new Cliente("Noelia", "uwu@gmail.com", 31, 
                "Calle uwu");
        
        System.out.println("c1 = c2? " + c1.equals(c2));
        
        c1.setEdad(32);
        
        System.out.println("c1 = c2? " + c1.equals(c2));
        
    }
    
}
