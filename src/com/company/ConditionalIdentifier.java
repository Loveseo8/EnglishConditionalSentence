package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class ConditionalIdentifier {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    int a = 0;

    public void identify(String words[]) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("had")) {
                for (i = 0; i < words.length; i++) {
                    if(words[i].contains("have")){
                for (i = 0; i < words.length; i++) {
                    if (words[i].contains("would") || words[i].contains("should") || words[i].contains("must") || words[i].contains("could") || words[i].contains("might") || words[i].contains("may")) {
                        //out.print("III");
                        a = 3;

                    }
                }
            }
        }
            } else if (words[i].contains("would") || words[i].contains("should") || words[i].contains("must") || words[i].contains("could") || words[i].contains("might") || words[i].contains("may")) {
                //out.print("II");
                a = 2;
            } else if (words[i].contains("will") || words[i].contains("ll")|| words[i].contains("should") || words[i].contains("can") || words[i].endsWith("ing") || words[i].contains("shall")) {
                //out.print("I");
                a = 1;
            }
        }

        switch (a){
            case 0: out.println(0);
            break;
            case 1: out.println("I");
            break;
            case 2: out.println("II");
            break;
            case 3: out.println("III");
            break;
        }
    }
}
