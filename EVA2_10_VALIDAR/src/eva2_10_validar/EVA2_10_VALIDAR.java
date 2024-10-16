/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_validar;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_10_VALIDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int SDAY;
        Scanner Captur = new Scanner(System.in);
        
        //CODE
        do{
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el Numero de Dia que Deseas Mostrar:");
        System.out.println("Tomando en Cuenta que el 1 = Domingo y el 7 = Sabado");
        System.out.println(" ");
        System.out.println("Ingresa el Dia: ");
        System.out.println(" ");
            SDAY = Captur.nextInt();
            Captur.nextLine();
        }while(SDAY < 1 || SDAY > 8);
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
