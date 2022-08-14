package com.ss.morsecodetranslator;

public class morsetotext {
    static void translate(String str) {
        if (str.equals("*-")) {
            System.out.print("A");
        }
        if (str.equals("-***")) {
            System.out.print("B");
        }
        /*
        if (str.equals(" ")) {
            System.out.print(" ");
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
