package OOPS;


class Computer {

    // create the new method
    public void playMusic() {
        System.out.println("Playing music");
    }

    // Another method but the return type is int
    public String getMeAPen(int cost) {
        return "Pen";
    }
}

public class ClassObjectExample {

    static void main(String[] args) {
        //  we have to create the obj

        Computer computer = new Computer();
        computer.playMusic();

        String str = computer.getMeAPen(10);
        String str2 = computer.getMeAPen(2);

        System.out.println(str);

    }

}
