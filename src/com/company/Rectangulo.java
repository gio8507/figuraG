package com.company;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(double altura, double base ) {
        super(altura, base );
    }

    @Override
    public double area() {

        return (base * altura);
    }

    @Override
    public double perimetro() {
        return 0;
    }

    public double altura() {


        return 2 * (base + altura);


    }
}
