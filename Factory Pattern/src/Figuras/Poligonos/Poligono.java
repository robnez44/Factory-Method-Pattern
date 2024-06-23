package Figuras.Poligonos;

import Figuras.Figura;

public abstract class Poligono extends Figura {

    protected double base;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Poligono(double base) {
        this.base = base;
    }
}
