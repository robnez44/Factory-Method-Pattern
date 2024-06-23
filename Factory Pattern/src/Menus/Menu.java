package Menus;

import Figuras.TipoFIgura;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static TipoFIgura menu() throws InputMismatchException {
        do {
            try{
                int opc;
                Scanner sc = new Scanner(System.in);

                System.out.println("\t\tIngresa el numero de la figura que quieres crear. " +
                        "\n1. Circulo \n2. Triangulo \n3. Cuadrado \n0. Salir\n");
                opc = sc.nextInt();
                sc.nextLine();

                if (opc == 0) {
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                }

                switch (opc) {
                    case 1: return TipoFIgura.CIRCULO;
                    case 2: return TipoFIgura.TRIANGULO;
                    case 3: return TipoFIgura.CUADRADO;
                    default: throw new InputMismatchException("Opcion no valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nIngresa una opcion valida\n");
            }
        }while(true);
    }
}
