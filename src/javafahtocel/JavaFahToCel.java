/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafahtocel;
import java.util.Scanner;

/**
 *
 * @author irina
 */
public class JavaFahToCel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temperature;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit");
        temperature = keyboard.nextInt();

        temperature = ((temperature - 32)*5)/9;

        System.out.println("temperature in Celsius = " + temperature);
    }
    
}
