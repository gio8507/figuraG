package com.company;

public class circulo extends FiguraGeometrica {

    public circulo(double altura, double base) {
        super(altura, base );
    }

    @Override
    public double area() {

        return (Math.PI*Math.pow(altura,2) /2);

    }
    public double perimetro(){

        return  Math.PI*2*altura/2;

    }

     }

