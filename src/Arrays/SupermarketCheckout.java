package Arrays;

import java.util.*;

class Customer {

    int items;

    Customer(int items) {
        this.items = items;
    }
}

public class SupermarketCheckout {

    public static int totalTime(Customer[] customers, int k) {

        Queue<Customer> queue = new LinkedList<>();

        for (Customer customer : customers) {
            queue.add(customer);
        }

        int time = 0;

        while (!queue.isEmpty()) {

            Customer customer = queue.poll();

            int processed = Math.min(customer.items, k);

            time += processed;
            customer.items -= processed;

            if (customer.items > 0) {
                queue.add(customer);
            }
        }

        return time;
    }

    static void main(String[] args) {

        Customer[] customers = {
                new Customer(5),
                new Customer(2)
        };

        int k = 3;

        int result = totalTime(customers, k);

        System.out.println("Total time = " + result + " seconds");
    }
}