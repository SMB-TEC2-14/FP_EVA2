/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_while_do_while;

/**
 *
 * @author santy
 */
public class EVA2_7_WHILE_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CODE
        
        //FOR = SE SABE CUANTAS VECES SE VA A REPETIR
        //WHILE = SON 0 O MÁS REPETICIONES
        //DO WHILE = 1 O MÁS REPETICIONES
        
        System.out.println("WHILE");
        int VAL = 1;
        while(VAL <= 10){//MIENTRAS SEA VERDADERO SE VAN A REPETIR LAS INSTRUCCIONES
            System.out.print(VAL + " - ");
            //VAL++;
        }
        System.out.println("DO WHILE");
        VAL = 1;
        do{
            System.out.print(VAL + " - ");
            VAL++;
        }while(VAL <= 10);//MIENTRAS SEA VERDADERO SE VAN A REPETIR LAS INSTRUCCIONES
        
    }
    
}
