/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_arreglos;

/**
 *
 * @author santy
 */
public class EVA2_17_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        
        //CODE
        String SemDay[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int Val[] = {20,50,100,200,500,1000};
        for(int i = 0; i < SemDay.length; i++){
                System.out.print(SemDay[i] + " - ");
        }
        System.out.println(" ");
        System.out.println(" ");
        for(int i = 0;  i < Val.length; i++){
                System.out.print(Val[i] + " - ");
        }
    }
    
}
