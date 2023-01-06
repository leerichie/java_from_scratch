package org.example.head_first_java_3rd.pg18;

import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordList1 = {"ridiculous", "agnostic", "happy-chappy", "fun", "naughty"};
        String[] wordLit2 = {"native", "foreign", "pink", "java-oriented", "workaholic"};
        String[] wordList3 = {"dinosaur", "avocado", "cooker", "wife", "lawn"};

        int oneLength = wordList1.length;
        int twoLength = wordLit2.length;
        int threeLength = wordList3.length;

        Random random = new Random();

        int rand1 = random.nextInt(oneLength);
        int rand2 = random.nextInt(twoLength);
        int rand3 = random.nextInt(threeLength);

        String phrase = wordList1[rand1] + " " + wordLit2[rand2] + " " + wordList3[rand3];

        System.out.println("What we need is a: " + phrase);

    }
}
