/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio01;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class S07ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Crear un nuevo objeto Scanner 
        Scanner input = new Scanner(System.in);
        
        //Mostar el mensaje al usuario
        System.out.println("INGRESE TEMPERATURA EN CELSIUS: ");
        double celsius = input.nextDouble();
        
        //Cinvertir celsius a fahrenheit
        double farentheit = 9.0/5*celsius+32;
        
        //Mostar el resultado
        System.out.println(celsius + "celsius son" + farentheit + "en farentheit");
        
        
    }
    
}
