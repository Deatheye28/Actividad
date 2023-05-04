/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julia
 */
public class Arbol {
     List<Integer> listaArbol = new ArrayList<>();
    
    public Arbol(){

    }
    
    public Arbol(List listaArbol){
        listaArbol = this.listaArbol;
    }
    public List getListaArbol(){
        return listaArbol;
    }
    public List setListaArbol(){
        return listaArbol;
    }
    
    public void agregarNumeros(){
         listaArbol.add(1);
         listaArbol.add(3);
         listaArbol.add(4);
         
     }
     public int pesoArbol(Arbol arbol){
         int peso = 0;
         for (int i = 0; i < listaArbol.size(); i++) {
             peso = peso + listaArbol.get(i);
             
         }
         System.out.println("El peso del arbol es:" + peso);
         return peso;
     }
     public float pesoPromedioArbol(Arbol arbol){
         float peso = 0;
         for (int i = 0; i < listaArbol.size(); i++) {
             peso = peso + listaArbol.get(i);
             
         }
         float promedio = peso / listaArbol.size();
         System.out.println("El peso promedio del arbol es:" + promedio);
         return promedio;
     }
     public int alturaArbol(Arbol arbol){
         int altura = 0;
             if(listaArbol.size() == 1){
                 altura = 1;
                 System.out.println("La altura del arbol es " + altura);
             }
             else if(listaArbol.size() >= 3){
                 altura = 2;
                 System.out.println("La altura del arbol es " + altura);
             }
             else if(listaArbol.size() >= 4){
                 altura = 3;
                 System.out.println("La altura del arbol es " + altura);
             }
         return altura;
     }
}


