/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_2_PROMEDIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        Scanner Captur = new Scanner(System.in);
        int Qualy, Acum;
        Acum = 0;
        
        //SALUDO
        System.out.println("Saludos Usuario, Sigue las Instrucciones");
        
        //INFORMACION AL USUARIO Y ORDEN DE CICLOS
        for(int i = 1; i <=10; i++){
        System.out.println("Bienvenido Estudiante #" + i);
        System.out.println(" ");
        System.out.println("Introduce la Calificacion");
            Qualy = Captur.nextInt();
            Captur.nextLine();
            Acum = Acum + Qualy;
        }
        
        //RESULTADO
        System.out.println("Estos son los resultados Acumulados");
        System.out.println(" ");
        System.out.println("Promedio Acumulado = " + (Acum / 10.00));
    }
    
}
