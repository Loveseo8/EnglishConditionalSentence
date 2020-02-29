package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        String sentence = in.nextLine();
        String s = sentence.toLowerCase().replaceAll(",", " ");
        String words[] = s.split(" ");
        int b = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("if") || words[i].contains("when")) {
                ConditionalIdentifier answer = new ConditionalIdentifier();
                answer.identify(words);
                b = 1;
            }
        }
        if (b == 0){
            out.print("Inverted");
        }
    }
}
