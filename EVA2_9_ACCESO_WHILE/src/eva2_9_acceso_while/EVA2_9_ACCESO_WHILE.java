/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_9_ACCESO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // PANTALLA DE VALIDACIÓN, VALIDACIÓN DE USUARIO Y CONTRASEÑA, PROGRAMA PRINCIPAL
        
        //VARIABLES
        Scanner CAPTUR = new Scanner(System.in);
        String USU = "", PSW = "";
        
        //SALUDO Y VALIDACIÓN DE USUARIO Y CONTRASEÑA
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("SALUDOS USUARIO :D");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("Ingresa tu Usuario y La Contraseña");
        System.out.println(" ");
        
        while(!(USU.equals("Admin") && PSW.equals("1234"))){
        System.out.println("USUARIO: ");
            USU = CAPTUR.nextLine();
        System.out.println(" ");
        System.out.println("CONTRASEÑA");
            PSW = CAPTUR.nextLine();
        System.out.println(" ");
        }
        
        //PROGRAMA PRINCIPAL
        System.out.println("Programa Principal!!");
    }
    
}
