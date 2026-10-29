package OOPS;

class Animal {

    // Create a method
    void makeSound() {
        System.out.println("Animal makeSound");
    }
}

/* extend panure class here we refer the single level inheritance */
class Dog extends Animal {
    void makeSound() {
        System.out.println("BOW BOW");
    }
}

public class InheritanceExample {
    static void main(String[] args) {

        Animal animal = new Dog();
        animal.makeSound();

    }

}
