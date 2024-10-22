/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author santy
 */
public class EVA2_18_RESTAURANTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES
        String MENU[] = {"Dogos", "Hamburguesa", "Boneless", "Tacos", "Montados", "Camarones"};
        int PRICE[] = {50, 80, 120, 150, 70, 200};
        int ORDER, CANT; 
        Scanner CAPTUR = new Scanner(System.in);
        
        //CODE
        System.out.println("Bienvenido al Restaurante Usuario");
        System.out.println(" ");
        System.out.println("A continuacion te mostrare el MENU");
        System.out.println(" ");
        System.out.println("MENU: ");
        for(int i = 0; i < MENU.length; i++){
            System.out.println(i + " - " + MENU[i] + " - " +  " $" + PRICE[i]);
        }
        System.out.println(" ");
        System.out.println("Que te gustaria ordenar (tomando en cuenta los numeros de los productos 0 - 5)");
        System.out.println("Ingresa el Numero de orden: ");
            ORDER = CAPTUR.nextInt();
            CAPTUR.nextLine();
        System.out.println(" ");
        System.out.println("Cuantos te gustaria ordenar");
        System.out.println("Ingresa la Cantidad: ");
            CANT = CAPTUR.nextInt();
            CAPTUR.nextLine();
        System.out.println(" ");
        System.out.println("El costo total seria: " + CANT * PRICE[ORDER]);
        
    }
    
}
