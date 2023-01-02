package org.example.linkedIn_learning.functional_interface;

public class Main {
    public static void main(String[] args) {

        GreetingMsg gm = new GreetingMsg() {
            @Override
            public void greet(String greetName) {
                System.out.println("Hello " + greetName);
            }
        };

        FarewellMsg fm = new FarewellMsg() {
            @Override
            public void farewell(String farewellName) {
                System.out.println("Nara " + farewellName);
            }
        };

        gm.greet("Lee");
        fm.farewell("Lee");
        gm.greet("Ania");
        fm.farewell("Ania");
    }
}
