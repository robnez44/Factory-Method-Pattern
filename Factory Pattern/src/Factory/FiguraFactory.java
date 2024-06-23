package Factory;

import Figuras.*;
import Figuras.Poligonos.Cuadrado;
import Figuras.Poligonos.Triangulo;

import java.util.Scanner;

public class FiguraFactory {
    public static Figura crearFigura(TipoFIgura figura) throws ClassNotFoundException {
        double base = 0;
        Scanner scanner = new Scanner(System.in);
        
        switch (figura){
            case CIRCULO:
                System.out.println("Ingresa el radio del circulo: ");
                double radio = scanner.nextDouble();
                return new Circulo(radio);
            case CUADRADO:
                System.out.println("Ingresa la base del cuadrado: ");
                base = scanner.nextDouble();
                return new Cuadrado(base);
            case TRIANGULO:
                System.out.println("Ingresa la base del triangulo: ");
                base = scanner.nextDouble();
                System.out.println("Ingresa la altura del triangulo: ");
                double altura = scanner.nextDouble();
                return new Triangulo(base, altura);
            default:
                throw new ClassNotFoundException(figura.name().toLowerCase() + " no es una figura existente");
        }

    }
}
