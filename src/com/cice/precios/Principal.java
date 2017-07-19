package com.cice.precios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author NYL
 */
public class Principal {
    static ArrayList<Double> precios = new ArrayList<>();
    static Scanner sc = new Scanner (System.in);
    static double aux;
    static int opcion;
    
    public static void main(String[] args) {
        mostrarMenu();
    }
    static void añadePrecio (){
        System.out.print("Introduzca el nuevo precio: ");
        precios.add(sc.nextDouble());
        System.out.println("");
        System.out.println("");
    }
    static void precioMedio (){
        for (double precio : precios)
                        aux += precio;
                    System.out.println("La media es de: " + aux/precios.size());
                    System.out.println("");
    }
    static void precioMaximo (){
        for (double precio : precios)
                        aux = Math.max(aux, precio);
                    System.out.println("El precio máximo es: " + aux);
                    System.out.println("");
    }
    static void precioMinimo (){
        aux = Double.MAX_VALUE;
        for (double precio: precios)
                       aux =Math.min(aux, precio);
                    System.out.println("El precio mínimo es: "+ aux);
                    System.out.println("");
    }
    static void listarPrecios (){
        System.out.println("Lista actualizada: " + precios.toString());
      }
    static void mostrarMenu (){
         opcion = 0;
        
        System.out.println("BIENVENIDO AL PROGRAMA DE PRECIOS=====");
        System.out.println("======================================");
        System.out.println("");
        
        elegirOpcion();
     }
    static void elegirOpcion (){
         do {
             aux = 0;
            System.out.println("1.) PRECIO NUEVO ");
            System.out.println("2.) PRECIO MEDIO ");
            System.out.println("3.) PRECIO MÁXIMO ");
            System.out.println("4.) PRECIO MÍNIMO ");
            System.out.println("5.) TODOS LOS PRECIOS");
            System.out.println("6.) SALIR ");
            System.out.println("");
            System.out.print("MARQUE SU OPCIÓN: ");
            opcion = sc.nextInt();
            System.out.println("");
            
             switch (opcion) {
                 case 1:
                    añadePrecio();
                     break;
                case 2:
                    precioMedio();
                    break;
                case 3:
                    precioMaximo();
                    break;
                case 4:
                    precioMinimo();
                    break;
                case 5:
                    listarPrecios();
                    break;
                case 6:
                     break;    
                default:
                    System.out.println("OPCION NO VÁLIDA...");
            }
  
        } while (opcion != 6);
        System.out.println("HASTA PRONTO...");
        System.out.println("");
     }
}

