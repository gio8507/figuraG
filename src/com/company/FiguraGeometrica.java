package com.company;

public abstract class FiguraGeometrica {
    protected double altura;
    protected double base;
    abstract public double area();
    abstract public double perimetro();

    public FiguraGeometrica(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

}

class Main {


    public static void main(String[] args) {
       Rectangulo r= new Rectangulo(2.2,2.3);
       circulo c = new circulo(2.2,0.0);
        System.out.println("el area de la primera figura es: ");
         System.out.println(r.area() + c.area());
        System.out.println("el perimetro de la primera figura es:");
        System.out.println(r.perimetro()+ c.perimetro());
        triangulo t = new triangulo(2.0,2.3);
        triangulo t2 = new triangulo(2.0,2.3);
        circulo C2 =new circulo(2.3,0.0);
        Rectangulo r2 = new Rectangulo(2.3,2.3);
        System.out.println("el area de segunda figura es:");
        System.out.println(t.area()+t2.area()+ (C2.area()/2)+r2.area() );

        }
    }

