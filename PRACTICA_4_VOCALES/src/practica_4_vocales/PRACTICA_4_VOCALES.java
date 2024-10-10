/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_4_vocales;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class PRACTICA_4_VOCALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        String TXT;
        
        //SALUDO Y CAPTURA DE INFOMACIÓN
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingresa el texto del cual deseas las vocales: ");
            TXT = Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias, en un momento te dare los resultados :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        //RESULTADO Y VALORACIÓN DE DATOS
        for(int i = 0; i < TXT.length(); i++){
            char a = TXT.charAt(i);
            
                if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' ||
                   a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U')
                    System.out.println(a);
        }
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
    }
    
}
