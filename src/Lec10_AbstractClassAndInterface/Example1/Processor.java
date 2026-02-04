package Lec10_AbstractClassAndInterface.Example1;

public class Processor {

    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("Area of the square: " + square.calculateArea());
        square.displayInfo();
    }
    
    
}
