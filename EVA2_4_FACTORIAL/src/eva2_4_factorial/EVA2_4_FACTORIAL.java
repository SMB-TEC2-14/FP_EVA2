/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_4_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        int Num, Acum;
        Scanner Captur = new Scanner(System.in);
        
        //SALUDO Y CAPTURA DE DATOS
        System.out.println("Saludos Usuario :D");
        System.out.println(" ");
        System.out.println("Ingresa el numero del que deseas la Factorial");
        System.out.println(" ");
            Num = Captur.nextInt();
            Captur.nextLine();
        System.out.println(" ");
        System.out.println("Gracias, a continuacion te dare el Resulado :D");
        System.out.println(" ");
        
        //RESULTADO Y VALORACIÓN DE DATOS
        Acum = 1;//PUNTO DE PARTIDA ES = 1
        //PUEDE SER A LA INVERSA DEL FOR "for(int i = Num; i >= 1; i--) ES LO MISMO NADA MÁS QUE MULTIPLICA DEL UN NUMERO MENOR A UN NUMERO MAYOR
        for(int i = 1; i <= Num; i++){//I = 1 "INICIO DE CICLO", I <= NUMERO CAPTURADO "CONDICIÓN, I++ "ES PROGRESIVO EN + 1"
            Acum = Acum * i;//ACUM = 1" = ACUM" * I" = <= NUM"
        }
        System.out.println("El Factorial de " + Num + " es: ");
        System.out.println(" ");
        System.out.println(Acum);
        System.out.println(" ");
    }
    
}
