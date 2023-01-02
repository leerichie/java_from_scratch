package org.example.linkedIn_learning.linked_list.LL_impl_Queue;

import java.util.LinkedList;

public class Store {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Lee"));
        queue.add(new Customer("Tom"));
        queue.add(new Customer("Ania"));
        queue.add(new Customer("Wojtuś"));
        queue.add(new Customer("Lidka"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }
    static void serveCustomer(LinkedList<Customer> queue){  // queue -> first-in-first-out
        Customer c = queue.poll(); // poll removes first element of list
        c.serve();
    }
}
