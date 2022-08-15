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
        if (chr == 'F' || chr == 'f') {
            System.out.print("**-* ");
        }
        if (chr == 'G' || chr == 'g') {
            System.out.print("--* ");
        }
        if (chr == 'H' || chr == 'h') {
            System.out.print("**** ");
        }
        if (chr == 'I' || chr == 'i') {
            System.out.print("** ");
        }
        if (chr == 'J' || chr == 'j') {
            System.out.print("*--- ");
        }
        if (chr == 'K' || chr == 'k') {
            System.out.print("-*- ");
        }
        if (chr == 'L' || chr == 'l') {
            System.out.print("*-** ");
        }
        if (chr == 'M' || chr == 'm') {
            System.out.print("-- ");
        }
        if (chr == 'N' || chr == 'n') {
            System.out.print("-* ");
        }
        if (chr == 'O' || chr == 'o') {
            System.out.print("--- ");
        }
        if (chr == 'P' || chr == 'p') {
            System.out.print("*--* ");
        }
        if (chr == 'Q' || chr == 'q') {
            System.out.print("--*- ");
        }
        if (chr == 'R' || chr == 'r') {
            System.out.print("*-* ");
        }
        if (chr == 'S' || chr == 's') {
            System.out.print("*** ");
        }
        if (chr == 'T' || chr == 't') {
            System.out.print("- ");
        }
        if (chr == 'U' || chr == 'u') {
            System.out.print("**- ");
        }
        if (chr == 'V' || chr == 'v') {
            System.out.print("***- ");
        }
        if (chr == 'W' || chr == 'w') {
            System.out.print("*-- ");
        }
        if (chr == 'X' || chr == 'x') {
            System.out.print("-**- ");
        }
        if (chr == 'Y' || chr == 'y') {
            System.out.print("-*-- ");
        }
        if (chr == 'Z' || chr == 'z') {
            System.out.print("--** ");
        }
        /*
        if (chr == '' || chr == '') {
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
