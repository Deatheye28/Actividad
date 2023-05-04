/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import arbol.Arbol;

public class Actividad3 {
     public static void main(String[] args) {
         Arbol arbol = new Arbol();
         arbol.agregarNumeros();
         //Peso del arbol
         arbol.pesoArbol(arbol);
         arbol.pesoPromedioArbol(arbol);
         arbol.alturaArbol(arbol);
     }
     
}
     
     
