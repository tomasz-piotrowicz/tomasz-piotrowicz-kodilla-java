package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String result = poemBeautifier.beautify("Lalalala", s -> s.toUpperCase());
        System.out.println(result);

        String result2 = poemBeautifier.beautify("Lalalalala", s -> s.concat("ABC"));
        System.out.println(result2);

        String result3 = poemBeautifier.beautify("Lalalalala", s -> s.substring(1,4));
        System.out.println(result3);

        String result4 = poemBeautifier.beautify("My name is Bond. James Bond", s -> s.replace("My", "His"));
        System.out.println(result4);

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

    }
}
