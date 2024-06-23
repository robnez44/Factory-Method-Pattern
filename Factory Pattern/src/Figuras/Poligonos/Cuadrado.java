package Figuras.Poligonos;

public class Cuadrado extends Poligono {

    public Cuadrado(double base) {
        super(base);
    }

    @Override
    public double calcularArea() {
        return base * base;
    }
}
