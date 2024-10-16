/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_validar_2;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_11_VALIDAR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int SDAY;
        Scanner CAPTUR = new Scanner(System.in);
        
        //CODE
        while(true){
            System.out.println(" ");
            System.out.println("Captura el numero de dia de la Semana ( 1 - 7 )");
            System.out.println(" ");
                SDAY = CAPTUR.nextInt();
                CAPTUR.nextLine();
        if(SDAY >= 1 && SDAY <= 7)
            break;
        }
        System.out.println(" ");
        if(SDAY == 1){
            System.out.println("El Dia seleccionado es DOMINGO");
            System.out.println("");
        }
        else if(SDAY == 2){
            System.out.println("eL Dia seleccionado es LUNES");
            System.out.println("");
            }
        else if(SDAY == 3){
            System.out.println("eL Dia seleccionado es MARTES");
            System.out.println("");
            }
        else if(SDAY == 4){
            System.out.println("eL Dia seleccionado es MIERCOLES");
            System.out.println("");
            }
        else if(SDAY == 5){
            System.out.println("eL Dia seleccionado es JUEVES");
            System.out.println("");
            }
        else if(SDAY == 6){
            System.out.println("eL Dia seleccionado es VIERNES");
            System.out.println("");
            }
        else if(SDAY == 7){
            System.out.println("eL Dia seleccionado es SABADO");
            System.out.println("");
        }
        else{
            System.out.println("El numero no es Valido");
            System.out.println("");
        }
    }
    
}
