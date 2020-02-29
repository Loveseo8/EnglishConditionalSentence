package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        String sentence = in.nextLine();
        String s = sentence.toLowerCase().replaceAll(",", " ").replaceAll("’", " ");
        String words[] = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("if")) {
                ConditionalIdentifier answer = new ConditionalIdentifier();
                answer.identify(words);
                break;
            } else {
                out.println("Inverted");
                break;
            }
        }
    }
}
