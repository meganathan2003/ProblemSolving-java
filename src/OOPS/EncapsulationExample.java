package OOPS;

class Human {

    private String name;
    private int age;


    // Here the constructor example
    public Human() {
        System.out.println("Human constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; // Here this means we are using or accessing the current obj
    }
}


public class EncapsulationExample {

    static void main(String[] args) {

        Human h = new Human();
        h.setName("John");
        System.out.println(h.getName());
    }


}
