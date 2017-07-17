
package com.cice.precios;

import java.util.Scanner;

/**
 *
 * @author NYL
 */
public class Interface {

    public void mostrarMenu() {

        int opcion;
        Scanner sc = new Scanner(System.in);

        System.out.println("BIENVENIDO AL REGISTRO DE PRECIOS");
        System.out.println("=================================");
        System.out.println("");

        do {

            System.out.println("Por favor, elija una de las siguientes opciones: ");
            System.out.println("1. Nuevo Precio ");
            System.out.println("2. Precio Medio");
            System.out.println("3. Precio Máximo");
            System.out.println("4. Precio Mínimo");
            System.out.println("5. Mostrar todos los precios");
            System.out.println("6. Salir");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Precios almacenar = new Precios();
                    almacenar.sumarPrecios();
                    break;
                case 2:
                    Media medios = new Media();
                    medios.hallarMedio();
                    break;
                case 5:
                    Todos totalidad = new Todos();
                    totalidad.listarTodos();
                    break;

            }
        } while (opcion != 6);
    }
}
