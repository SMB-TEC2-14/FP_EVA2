/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_2_numeros;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class PRACTICA_2_NUMEROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int NUM1, NUM2, ACUM;
        
        //SALUDO Y CAPTURA DE INFORMACIÓN
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Vamos a capturar los limites de una secuencia, cual es el Numero de Inicio? ");
            NUM1 = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("Muy bien, ahora cual sera el Numero del Final");
            NUM2 = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("En un momento te dare el resultado :D");
        System.out.println(" ");
        
        //VALORACIÓN DE RESULTADOS
        ACUM = NUM1;
        for(int i = ACUM; i <= NUM2; i++){
            System.out.println(" ");
            System.out.println(i);
            System.out.println("");
        }
        
    }
    
}
