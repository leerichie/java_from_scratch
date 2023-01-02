package org.example.linkedIn_learning.inheritance_1;

import java.util.ArrayList;
import java.util.Random;

public class Randomness extends Random {

    public String nextLetter() {
        int letterAtStart = 97;     // ASCII
        int randomInt = new Random().nextInt(26) + letterAtStart;  // 26 letters of alphabet
        return "" + (char) randomInt;
    }

    public String nextWord() {
        String[] words = {"one", "name", "tart", "burger", "hottie", "coder"};
        int index = new Random().nextInt(words.length);
        return words[index];
    }

    public String nextArrayList() {
        ArrayList<String> wordsArray = new ArrayList<>();
        wordsArray.add("hello");
        wordsArray.add("my");
        wordsArray.add("nickname");
        wordsArray.add("is");
        wordsArray.add("*******");
        int index = new Random().nextInt(wordsArray.size());
        return wordsArray.get(index);
    }
}
