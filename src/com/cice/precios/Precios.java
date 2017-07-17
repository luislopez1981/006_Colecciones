package com.cice.precios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NYL
 */
public class Precios {

    public ArrayList<Double> precios = new ArrayList();

    public void sumarPrecios() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el nuevo precio ");
        double nuevo = sc.nextDouble();

        precios.add(nuevo);
        

    }

       
    public double mediaPrecios() {

        double sumatorio  = 0;
        for (int i = 0; i <precios.size();i++){
            sumatorio = precios.get(i);
        }return sumatorio;
    }

    public double tamañoArray() {
        double tamaño = 0;
        tamaño = precios.size();
        return tamaño;
    }
    public void todos (){
        for (int i = 0; i<precios.size(); i++){
            System.out.println(precios.get(i));
        }
        
    }
    
}

