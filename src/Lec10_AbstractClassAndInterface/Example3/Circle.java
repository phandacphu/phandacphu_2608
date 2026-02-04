package Lec10_AbstractClassAndInterface.Example3;

public class Circle implements IShape {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    public void fillColor() {
        System.out.println("Filling the circle with green");
    }

}
