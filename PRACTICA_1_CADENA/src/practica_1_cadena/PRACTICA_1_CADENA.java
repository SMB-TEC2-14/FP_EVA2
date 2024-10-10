/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_1_cadena;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class PRACTICA_1_CADENA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        String TXT;
        int NUM, REP;
        
        //SALUDO E INFORMACIÓN AL USUARIO
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Sigue las instrucciones");
        System.out.println(" ");
        System.out.println("Vamos a repetir un Texto, cuantas veces sera?");
            NUM = Captur.nextInt();
                Captur.nextLine();
        System.out.println("Cual es el texto que deseas repetir?");
            TXT = Captur.nextLine();
        System.out.println(" ");
        System.out.println("Sigamos");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        //VALORACIÓN DE RESULTADOS
        REP = 0;
        for(int i = 1; i <= NUM; i++){
            System.out.println(TXT);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        }

    }
    
}
