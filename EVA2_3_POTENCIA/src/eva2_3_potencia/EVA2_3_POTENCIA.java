/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_3_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int base, expo;
        Scanner Captur = new Scanner(System.in);
        
        //SALUDO Y CAPTURA DE DATOS
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa la Base");
        base = Captur.nextInt();
        Captur.nextLine();
        System.out.println(" ");
        System.out.println("Ahora Ingresa el Exponente");
        expo = Captur.nextInt();
        Captur.nextLine();
        System.out.println(" ");
        
        int acum = 1;
        for(int i = 1; i <= expo; i++){
            acum = acum * base;
        }
        System.out.println("La Potencia es: " + acum);
        System.out.println(" ");
    }
    
}
