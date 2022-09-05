package com.homework;

public class NamePrinter {
    public void printName(Shape shape) {
        if (shape instanceof Circle)
            new Circle().printName();
        else if (shape instanceof Pentagon)
            new Pentagon().printName();
        else if (shape instanceof Quad)
            new Quad().printName();
        else if (shape instanceof Square)
            new Square().printName();
        else
            new Triangle().printName();

    }
}

class Test {
    public static void main(String[] args) {
        NamePrinter namePrinter = new NamePrinter();

        Circle circle = new Circle();
        namePrinter.printName(circle);

        Pentagon pentagon = new Pentagon();
        namePrinter.printName(pentagon);

        Quad quad = new Quad();
        namePrinter.printName(quad);

        Square square = new Square();
        namePrinter.printName(square);
        
        Triangle triangle = new Triangle();
        namePrinter.printName(triangle);
    }

}


