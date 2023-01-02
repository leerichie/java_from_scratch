package org.example.linkedIn_learning.functional_interface.lambdas;

import org.example.linkedIn_learning.functional_interface.GreetingMsg;
import org.example.linkedIn_learning.functional_interface.MessagePrinter;

public class LambdaMain {
    public static void main(String[] args) {

        // functional interface
//        GreetingMsg gm = new GreetingMsg() {        // long functional code
//            @Override
//            public void greet(String greetName) {
//                System.out.println("Hello " + greetName);
//            }
//        };
//        gm.greet("Lee");

        // lambda
        GreetingMsg gm2 = (String greetName2) -> {  // new SHORT functional with LAMBDA
            System.out.println("Hello " + greetName2);
        };
        gm2.greet("Lee");

        MessagePrinter mp = () -> {
            System.out.println("This is a msg");
        };
        mp.printMsg();
    }
}
