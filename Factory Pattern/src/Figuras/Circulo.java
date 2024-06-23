package Figuras;

public class Circulo extends Figura {

    private double radio;

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}
