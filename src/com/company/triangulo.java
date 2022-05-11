package com.company;

public class triangulo extends FiguraGeometrica {
    public triangulo(double altura, double base) {
        super(altura, base);
    }

    @Override
    public double area() {
        return  base *altura/2;
    }

    @Override
    public double perimetro() {
        return 0;
    }

}
