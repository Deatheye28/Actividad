/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {
        int x;
        int k;
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el primer numero para x");
        x = reader.nextInt();
        System.out.println("Ingrese el segundo numero para k");
        k = reader.nextInt();
        
        List cocientes = new ArrayList<>();
        List residuos = new ArrayList<>();
        int cociente = 0;
        int residuo = 0;
        
        do {            
            cociente = x / k;
            residuo = x % k;
            x = cociente;
            cocientes.add(cociente);
            residuos.add(residuo);
        } while (cociente != 1);
        List total = new ArrayList<>();
        total.add(cocientes.get(cocientes.size()-1));
        total.add(residuos);
        System.out.println("El valor total es" + total + k);

    }
}
  

