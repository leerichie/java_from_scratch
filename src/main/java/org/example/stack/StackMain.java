package org.example.stack;

import java.util.List;
import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack<Character> charStack = new Stack<>();
        charStack.push('c');    // places top
        charStack.push('a');
        charStack.push('t');

        System.out.println(charStack.peek());   // checks top

        System.out.println(charStack.empty());

        System.out.println(charStack.pop()); // removes top
        System.out.println(charStack.pop());
        System.out.println(charStack.pop());

        charStack.push('o');
        System.out.println(charStack.pop());
    }
}
