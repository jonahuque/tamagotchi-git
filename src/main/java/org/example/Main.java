package org.example;

import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int saciedad = -1;
    private static int energia = 2;
    private static int diversion = 2;
    public static void main(String[] args) {
        int opcion;

        do{
            opcion = menuPrincipal();
            switch(opcion){
                case 1:
                    mostrarEstado();
                    break;
                case 0:
                    System.out.println("Saliendo del juego");
                    break;
                case 2:
                    if (saciedad < 10) {
                        saciedad = saciedad + 2;
                        if (saciedad > 10) {
                            saciedad = 10;
                        }
                        diversion--;
                        mostrarEstado();
                    } else {
                        System.out.println("No tengo hambre");
                    }
                    break;
                case 3:
                    if (diversion < 10) {
                        diversion += 2;
                        if (diversion > 10) {
                            diversion = 10;
                        }
                        saciedad--;
                        energia-=2;
                        mostrarEstado();
                    } else {
                        System.out.println("Ahora no me apetece jugar");
                    }
                    break;
                case 4:
                    if (energia < 10) {
                        energia += 3;
                        if (energia > 10) {
                            energia = 10;
                        }
                        saciedad -= 3;
                        diversion -= 2;
                        mostrarEstado();
                    } else {
                        System.out.println("No tengo sueño");
                    }
                    break;
                case 5:
                    if (energia < 10) {
                        energia += 2;
                        if (energia > 10) {
                            energia = 10;
                        }
                        diversion --;
                        mostrarEstado();
                    }else{
                        System.out.println("Ya me siento bien");
                    }
                    break;
            }
        }while(opcion !=0);

    }

    public static int menuPrincipal(){
        int opcion;

        do{
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("5. Curar");
            System.out.println("------------------------");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opción del menú");
            while(!scanner.hasNextInt()){
                scanner.next();
                System.out.println("Opción no válida. Introduce un número: ");

            }
            opcion = scanner.nextInt();
        }while(opcion < 0 || opcion > 5);

        return opcion;
    }

    public static void mostrarEstado(){
        if (saciedad <=0 || energia <=0 || diversion <=0){
            System.out.println(" (X_X)  :(Game Over):");
            System.out.println(" /|_|\\");
            System.out.println("  | |");
            return;
        }
        if (saciedad > 5 && energia > 5 && diversion > 5){
            System.out.println(" (•‿•)  ¡Estoy Feliz!");
            System.out.println(" /|_|\\");
            System.out.println("  | |");

        }else if(diversion <=4){
            System.out.println(" (-︵-)  Estoy aburrido");
            System.out.println(" /|_|\\");
            System.out.println("  | |");

        }else if(energia <=4){
            System.out.println(" (-_-)  ZZzzzZZZzzz");
            System.out.println(" /|_|\\");
            System.out.println("  | |");

        }else if(saciedad <=4){
            System.out.println(" (•︵•)  Tengo hambre!sd");
            System.out.println(" /|_|\\");
            System.out.println("  | |");
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
