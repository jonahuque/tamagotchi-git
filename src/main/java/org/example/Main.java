package org.example;

import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;

        do{
            opcion = menuPrincipal();
        }while(opcion !=0);

    }

    public static int menuPrincipal(){
        int opcion;

        do{
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("------------------------");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción del menú");
            while(!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Opción no válida. Introduce un número: ");

            }
            opcion = scanner.nextInt();
        }while(opcion < 0 || opcion > 4);

        return opcion;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
