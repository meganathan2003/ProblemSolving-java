package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Here we are going to see the threads concept here the most important
 * concepts
 *
 *
 */

//class A extends Thread {
//
//    public void run() {
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("hi");
//            // Every millseconds aprm uh thread kita soluran wait minutes
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
//
//class B extends Thread {
//
//    public void run() {
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("dinesh");
//        }
//    }
//}


class A implements Runnable {

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


class B implements Runnable {

    public void run() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("dinesh");
        }
    }
}


public class ThreadExample {

    static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();


        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
