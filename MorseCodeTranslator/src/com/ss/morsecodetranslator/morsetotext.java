package com.ss.morsecodetranslator;

public class morsetotext {
    static void translate(String str) {
        if (str.equals("*-")) {
            System.out.print("A");
        }
        if (str.equals("-***")) {
            System.out.print("B");
        }
        if (str.equals("-*-*")) {
            System.out.print("C");
        }
        if (str.equals("-**")) {
            System.out.print("D");
        }
        if (str.equals("*")) {
            System.out.print("E");
        }
        if (str.equals("**-*")) {
            System.out.print("F");
        }
        if (str.equals("--*")) {
            System.out.print("G");
        }
        if (str.equals("****")) {
            System.out.print("H");
        }
        if (str.equals("**")) {
            System.out.print("I");
        }
        if (str.equals("*---")) {
            System.out.print("J");
        }
        if (str.equals("-*-")) {
            System.out.print("K");
        }
        if (str.equals("*-**")) {
            System.out.print("L");
        }
        if (str.equals("--")) {
            System.out.print("M");
        }
        if (str.equals("-*")) {
            System.out.print("N");
        }
        if (str.equals("---")) {
            System.out.print("O");
        }
        if (str.equals("*--*")) {
            System.out.print("P");
        }
        if (str.equals("--*-")) {
            System.out.print("Q");
        }
        if (str.equals("*-*")) {
            System.out.print("R");
        }
        if (str.equals("***")) {
            System.out.print("S");
        }
        if (str.equals("-")) {
            System.out.print("T");
        }
        if (str.equals("**-")) {
            System.out.print("U");
        }
        if (str.equals("***-")) {
            System.out.print("V");
        }
        if (str.equals("*--")) {
            System.out.print("W");
        }
        if (str.equals("-**-")) {
            System.out.print("X");
        }
        if (str.equals("-*--")) {
            System.out.print("Y");
        }
        if (str.equals("--**")) {
            System.out.print("Z");
        }
        /*
        if (str.equals("")) {
            System.out.print("");
        }
         */
    }

    public static void check(String in) {
        String stg;
        if (in != null) {
            stg = String.valueOf(in.charAt(0));
            for (int i = 1; i < in.length(); i++) {
                if (in.charAt(i) == '/') {
                    if (in.charAt(i + 1) == '/') {
                        i += 1;
                        translate(stg);
                        stg = "";
                        System.out.print(" ");
                    } else {
                        // check with morsecode
                        translate(stg);
                        stg = String.valueOf(in.charAt(i + 1));
                        i += 1;
                    }
                } else {
                    stg = stg + in.charAt(i);
                }
            }
            translate(stg);
        }
    }
}
