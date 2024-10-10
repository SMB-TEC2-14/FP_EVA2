/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practia_5_patron;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class PRACTIA_5_PATRON {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int NUM;
        String CAD = "";
        //SALUDO Y CAPTURA DE DATOS
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingresa el numero del patron: ");
            NUM = Captur.nextInt();
                Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias en un momento de dare el resultado :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        
        //VALORACIÓN DE RESULTADOS
        for(int i = 0; i <= NUM; i++){
            CAD = CAD + "*";
            System.out.println(CAD);
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
    }
    
}
