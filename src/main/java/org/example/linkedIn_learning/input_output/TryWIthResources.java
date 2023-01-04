package org.example.linkedIn_learning.input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWIthResources {
    public static void main(String[] args) {

        // TRW Buffer & Writer in parentheses (autoclose & prevents memory leaks) instead of try block

        try (BufferedReader reader = new BufferedReader(new StringReader("String reader text"));
             StringWriter writer = new StringWriter())
        {
            writer.write(reader.readLine());
            System.out.println(writer);

        } catch (IOException e) {
            throw new RuntimeException("bla blaa kehjsdc sjdf sdjf");
        }
    }
}
