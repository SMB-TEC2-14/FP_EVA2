/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_19_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES}
        Scanner CAPT = new Scanner(System.in);
        String MENU[];
        int PRICE[];
        int CANT;
        
        //CODE
        System.out.println("Saludos Usuario :D");
        System.out.println("Cuantos productos deseas en tu Menu: ");
            CANT = CAPT.nextInt();
            MENU = new String[CANT]; //TAMAÑO DEL ARREGLO ES "CANT"
            PRICE = new int[CANT];
            
        for(int i = 0; i < MENU.length; i++){
            System.out.println("Ingresa el Nombre del Producto: ");
            MENU[i] = CAPT.nextLine();
            CAPT.nextLine();
            System.out.println("Cual seria el Precio: ");
            PRICE[i] = CAPT.nextInt();
            CAPT.nextLine();
        }
        int ORDER, CANTD; 
        for(int i = 0; i < MENU.length; i++){
            System.out.println(i + " - " + MENU[i] + " - " +  " $" + PRICE[i]);
        }
        System.out.println(" ");
        System.out.println("Que te gustaria ordenar (tomando en cuenta los numeros de los productos 0 - 5)");
        System.out.println("Ingresa el Numero de orden: ");
            ORDER = CAPT.nextInt();
            CAPT.nextLine();
        System.out.println(" ");
        System.out.println("Cuantos te gustaria ordenar");
        System.out.println("Ingresa la Cantidad: ");
            CANTD = CAPT.nextInt();
            CAPT.nextLine();
        System.out.println(" ");
        System.out.println("El costo total seria: " + CANTD * PRICE[ORDER]);
    }
    
}
