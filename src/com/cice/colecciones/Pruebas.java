/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.colecciones;

import java.util.ArrayList;

/**
 *
 * @author NYL
 */
public class Pruebas {

    public static void main(String[] args) {

        ArrayList<String> presentacion = new ArrayList();

        presentacion.add("Hola, me llamo Luis");

        presentacion.add("Tengo una princesa que se llama Sara.");

        presentacion.add("Mi mujer se llama Nuria.");

//        String palabra = presentacion.get(0);
//
//        int longitud = presentacion.size();
//
//        int posicion = presentacion.indexOf(palabra);
//
//        System.out.println(palabra);
//        System.out.println(longitud);
//        System.out.println(posicion);

        for (int i = 0; i < presentacion.size(); i++) {
            System.out.println(presentacion.get(i));
        }

    }
}
