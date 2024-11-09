/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_examen_practico_24550835;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_EXAMEN_PRACTICO_24550835 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CODE
        Random random = new Random();
        String[] opciones = {"Piedra", "Papel", "Tijera"};
        Scanner Scan = new Scanner (System.in);
        //String [] decision = {"JUGAR OTRA VEZ" , "TERMINAR JUEGO"};
        //String jugar, si, no;
        
        System.out.println("BIENVENIDO");
        System.out.println("ELIGE ENTRE 0 = PIEDRA, 1 = PAPEL, 2 = TIJERA");
        int eleccionUsuario = Scan.nextInt();
        
        
        if (eleccionUsuario < 0 || eleccionUsuario > 2) {
            System.out.println("NUMERO NO VALIDO");
        } else {
            
            System.out.println("Has elegido: " + opciones[eleccionUsuario]);
            
            int eleccionComputadora = random.nextInt(3);
            System.out.println("La computadora ha elegido: " + opciones[eleccionComputadora]);
            
              
            if (eleccionUsuario == eleccionComputadora) {
                System.out.println("EMPATE");
                System.out.println("DESEAS JUGAR OTRA VEZ, 0 = si, 1 = no");
                
                
            } else if ((eleccionUsuario == 0 && eleccionComputadora == 2) || (eleccionUsuario == 1 && eleccionComputadora == 0) || (eleccionUsuario == 2 && eleccionComputadora == 1)) {
                System.out.println("TU GANAS");
                System.out.println("DESEAS JUGAR OTRA VEZ, 0 = si, 1 = no");
                
            } else{
                System.out.println("PERDISTE");
                System.out.println("DESEAS JUGAR OTRA VEZ, 0 = si, 1 = no");
                
            }
            
        }
    }
    
}
