/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.precios;

/**
 *
 * @author NYL
 */
public class Media {
    
    public void hallarMedio (){
        
          
        Precios prec = new Precios();
       
        double suma = prec.mediaPrecios();
        System.out.println("La suma es de " + suma);
        
        double tamaño = prec.tamañoArray();
        System.out.println("el tamaño es de: " + tamaño);
        double media = suma / tamaño;
//        System.out.println("La media es de " + media);
      
    }
    
}
