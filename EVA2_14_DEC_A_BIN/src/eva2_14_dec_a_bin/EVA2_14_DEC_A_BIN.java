/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_14_DEC_A_BIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner scanner = new Scanner(System.in);
        String binario = "";
        //CODE
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        
        
        if (numero == 0) {
            binario = "0";
        } else {
            while (numero > 0) {
                binario = (numero % 2) + binario;
                numero /= 2;
            }
        }
        
        System.out.println("El número en binario es: " + binario);
    }
    
}
