/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_3_caracter;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class PRACTICA_3_CARACTER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        String TXT;
        
        //SALUDO Y CAPTURA DE DATOS
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingresa el texto que deseas imprimir: ");
            TXT = Captur.nextLine();
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("En un momento te dare el resultado :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        
        //RESULTADO Y VALORACIÓN DE LA INFORMACIÓN
        for(int i = 0; i < TXT.length(); i++){
            System.out.println(TXT.charAt(i));
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
    }
    
}
