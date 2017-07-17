/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.colecciones;

import java.util.ArrayList;

/**
 *
 * @author Formador
 */
public class Collecciones {
    
    public static void main(String[] args){
        
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Hola");
        lista.add("Me llamo Gustavo");
        lista.add("Soy instructor de Java en CICE");
        
        lista.add("Hola");
        lista.add(", de nuevo...");
        
        //String saludo = lista.get(0);
        System.out.println(lista.size());
        
        //lista.set(0, "Adios");
        System.out.println(lista);
        
        lista.removeIf((a) -> a.contains("Hola"));
        
        System.out.println(lista);
        
        //lista.clear();
        //System.out.println(lista.size());
    }
    
}
