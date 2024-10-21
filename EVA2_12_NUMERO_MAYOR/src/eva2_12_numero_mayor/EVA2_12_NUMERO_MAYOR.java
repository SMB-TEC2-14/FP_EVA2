/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_12_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLE
        int NUM, NUM2 = 99999999;
        Scanner CAPTUR = new Scanner(System.in);
        
        //CODE
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("SALUDOS USUARIO :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingresa un numero y te mostrare el numero mayor, si ingresas un numero negativo terminare y te mostrare el numero mas grande");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        
        do{
            System.out.println("Ingresa el Numero");
            NUM = CAPTUR.nextInt();
            CAPTUR.nextLine();
            if(NUM > NUM2)
                NUM2 = NUM;
        }while(NUM != -1);
        System.out.println(NUM2);
    }
    
}
