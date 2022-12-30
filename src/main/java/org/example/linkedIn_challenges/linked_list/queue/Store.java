package org.example.linkedIn_challenges.linked_list.queue;

import org.example.linkedIn_challenges.linked_list.LinkedList;

public class Store {
    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Lee"));
        queue.add(new Customer("Ania"));
        queue.add(new Customer("Wojtuś"));
        queue.add(new Customer("Lidka"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }
    static void serveCustomer(LinkedList<Customer> queue){
        Customer c = queue.poll();
        c.serve();
    }
}
