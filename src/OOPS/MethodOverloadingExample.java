package OOPS;

// Create a sep clas

class Calculator {

    // method for add the two values
    public int add(int a, int b) {
        return a + b;
    }

    // This is method override same method name but diff parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingExample {

    static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(10, 20));
    }
}
