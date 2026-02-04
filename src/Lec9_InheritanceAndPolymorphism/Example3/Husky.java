package Lec9_InheritanceAndPolymorphism.Example3;

class Husky extends dog {

    int price = 1500;

    void displayPrice() {
        System.out.println("Dog's price: " + super.price);
        System.out.println("Husky's price: " + price);
    }

    Husky(){
        super();
        System.out.println("Husky's constructor is invoked");
    }
}
