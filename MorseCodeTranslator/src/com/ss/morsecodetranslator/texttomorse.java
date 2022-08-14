package com.ss.morsecodetranslator;

public class texttomorse {

    static void translate(char chr) {
        if (chr == 'A' || chr == 'a') {
            System.out.print("*- ");
        }
        if (chr == 'B' || chr == 'b') {
            System.out.print("-*** ");
        }
        if (chr == 'C' || chr == 'c') {
            System.out.print("-*-* ");
        }
        if (chr == 'D' || chr == 'd') {
            System.out.print("-** ");
        }
        if (chr == 'E' || chr == 'e') {
            System.out.print("* ");
        }
        /*
        if (chr == ' ' || chr == ' ') {
            System.out.print(" ");
        }
         */
    }

    public static void check(String in) {
        char ch;
        if (in != null) {
            ch = in.charAt(0);
            //check with translate
            translate(ch);
            for (int i = 1; i < in.length(); i++) {
                if (in.charAt(i) == '/') {
                    System.out.print("  ");
                } else {
                    // check with translate
                    translate(in.charAt(i));
                }
            }
        }
    }
}
