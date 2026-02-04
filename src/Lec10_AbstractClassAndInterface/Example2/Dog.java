package Lec10_AbstractClassAndInterface.Example2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Barks barks");
    
    }
}
