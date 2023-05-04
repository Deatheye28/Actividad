/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.Scanner;

/**
 *
 * @author julia
 */
public class Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        float num1;
        float num2;
        System.out.println("Ingrese el primer numero");
        num1 = reader.nextFloat();
        System.out.println("Ingrese el segundo numero");
        num2 = reader.nextFloat();
        
        float total = num1 / num2;
        
        System.out.println("La division entre " + num1 + " y " + num2 + " es igual a " + total);
    }
    
}
