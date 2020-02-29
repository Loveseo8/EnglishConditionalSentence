package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class ConditionalIdentifier {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    int a = 0;

    public void identify(String words[]) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("have") || words[i].contains("haven’t") || words[i].contains("has") || words[i].contains("hasn’t")){
                for (i = 0; i < words.length; i++) {
                    if (words[i].contains("would") || words[i].contains("wouldn’t") || words[i].contains("could") || words[i].contains("couldn’t") || words[i].contains("might") || words[i].contains("mightn’t") || words[i].contains("must") || words[i].contains("mustn’t") || words[i].contains("should") || words[i].contains("shouldn’t")) {
                        for (i = 0; i < words.length; i++) {
                            if (words[i].contains("had") || words[i].contains("hadn’t")) {
                                a = 3;

                            }
                        }
                    }
                }
            } else if (words[i].contains("would") || words[i].contains("wouldn’t") || words[i].contains("could") || words[i].contains("couldn’t") || words[i].contains("might") || words[i].contains("mightn’t") || words[i].contains("must") || words[i].contains("mustn’t") || words[i].contains("should") || words[i].contains("shouldn’t")) {
                a = 2;

            } else if (words[i].contains("will") || words[i].endsWith("’ll") || words[i].contains("won’t") || words[i].contains("can") || words[i].contains("can’t") || words[i].contains("may") || words[i].contains("mayn’t") || words[i].contains("must") || words[i].contains("mustn’t") || words[i].contains("should") || words[i].contains("shouldn’t")) {
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
