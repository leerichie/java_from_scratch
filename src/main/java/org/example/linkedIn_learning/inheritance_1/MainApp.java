package org.example.linkedIn_learning.inheritance_1;

public class MainApp {
    public static void main(String[] args) {

        Randomness random = new Randomness();

        System.out.println(random.nextInt());
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble());

        System.out.println("Letter: " + random.nextLetter());    // own char from ASCII method

        System.out.println("String[]: " + random.nextWord());  // own String [] method

        System.out.println("ArrayList<String>: " + random.nextArrayList()); // own ArrayList method

//        int randomInt = random.nextInt(0, 20);
//        double randomDouble = random.nextDouble(0.0, 20.0);
//        boolean randomBoolean = random.nextBoolean();

//        System.out.println("A random int - " + randomInt);
//        System.out.println("A random double - " + randomDouble);
//        System.out.println("A random boolean - " + randomBoolean);

    }
}
