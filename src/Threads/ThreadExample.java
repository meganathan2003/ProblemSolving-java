package Threads;

/**
 * Here we are going to see the threads concept here the most important
 * concepts
 *
 *
 */

class A extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("hi");
            // Every millseconds aprm uh thread kita soluran wait minutes
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class B extends Thread {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("dinesh");
        }
    }
}


public class ThreadExample {

    static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
