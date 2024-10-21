/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_ciclos_arreglos;

/**
 *
 * @author santy
 */
public class EVA2_16_CICLOS_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int[] datos, x, y, z;//Todos son arreglos
        int val1, val2, arreglo[];//Aqui el arreglo es Arreglo y los valores son enteros
        
        arreglo = new int[10];//el arreglo se puede daclara en la misma linea o en otra diferente
        
        for(int i = 0; i < 10; i++){//el for esta diseñado para poder interpretar los arreglos ya que se le puede definir un limite logico
            arreglo[i] = (int)(Math.random() * 100);//Math genera numero double (decimales) al multiplicarlos *100 es más sencillo convertirlo a entero
            
        }
        for(int i = 0; i < 10; i++){
            System.out.println(arreglo[i]);
        }
    }
    
}
