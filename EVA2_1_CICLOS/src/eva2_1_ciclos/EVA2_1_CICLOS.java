/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_ciclos;

/**
 *
 * @author santy
 */
public class EVA2_1_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ciclo o For es para sabemos cuantas veces se va a repetir una instrucción
        //Funciona co,o un contador (Inicio, Fin, Salto)
        //i == index == indice
        //vamos a repetir 10 veces. Contando del 1 al 10
        //"++" Es un operador acumulador el cual da la orden de sumar +1 a la variable, en su contraparte el "--" le resta -1 a la variable, += suba "n" a la variable al igual que "-=",etc
        //Nosotros controlamos el punto de inicio y fin
        //Acumulador = Una Operación para adicionar valores 
        //(int acum = 0;) puede tener cualquier punto de partida (acum = acum + 1;)
        for(int i = 0; i <= 9; i++){
            System.out.print(i + " - ");
        }
        System.out.println(" ");
        for(int i = 10; i >= 1; i--){
            System.out.print(i + " - ");
        }
         System.out.println(" ");
    }
    
}
