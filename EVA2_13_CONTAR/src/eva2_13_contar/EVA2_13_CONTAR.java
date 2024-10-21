/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_contar;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_13_CONTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner scanner = new Scanner(System.in);
        
        //CODE
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("SALUDOS USUARIO :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingresa una cadena de texto para contar las vocables que contiene");
        System.out.println(" ");
        String TXT = scanner.nextLine();
        
        int cantidadVocales = VOCAL(TXT);
        System.out.println(" ");
        System.out.println("La cantidad de vocales es: " + cantidadVocales);
        System.out.println(" ");
    }

    public static int VOCAL(String TXT) {
        int CUENTA = 0;
        TXT = TXT.toLowerCase();

        for (int i = 0; i < TXT.length(); i++) {
            char v = TXT.charAt(i);

            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                CUENTA++;
            }
        }
        return CUENTA;
    }
}
    

