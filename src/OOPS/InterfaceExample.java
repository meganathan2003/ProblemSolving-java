package OOPS;

// Here we are creating the interface
interface A {
    // At interface if you create the variable it considers are final and static

    int age = 22;

    void show();

    void config();
}

/**
 * Point to rember in interface
 * <p>
 * 1. class ---> class -> extends
 * 2. class -> interface -> implements
 * 3. interface -> interface -> extends
 */


class B implements A {

    public void show() {
        System.out.println("show");
    }

    public void config() {
        System.out.println("config");
    }
}


/**
 * Real exammple of the interface
 * Here the example we called as tight coupling that means one class extends another without write the clean code
 */
interface Computerz {
    void code();
}

class Laptop implements Computerz {
    public void code() {
        System.out.println("Laptop code");
    }
}

class Desktop implements Computerz {
    public void code() {
        System.out.println("Desktop code");
    }
}

class Developer {
    public void devApp(Computerz lap) {
        lap.code();
    }

}


public class InterfaceExample {

    static void main(String[] args) {
        Computerz lap = new Laptop();
        Computerz desktop = new Desktop();

        Developer dinesh = new Developer();

        dinesh.devApp(desktop);


    }
}
