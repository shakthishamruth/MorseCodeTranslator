package com.ss.morsecodetranslator;

public class morsetotext {

    // translate not working!
    static void translate(String str) {
        if (str == "*-") {
            System.out.print("A");
        }
        if (str == "-***") {
            System.out.print("B");
        }
    }

    public static void check(String in) {
        String stg;
        if (in != null) {
            stg = String.valueOf(in.charAt(0));
            for (int i = 1; i < in.length(); i++) {
                if (in.charAt(i) == '/') {
                    // check with morsecode
                    translate(stg);
                    System.out.println(stg);
                    stg = String.valueOf(in.charAt(i + 1));
                    i += 1;
                } else {
                    stg = stg + in.charAt(i);
                }
            }
            translate(stg);
            System.out.println(stg);
        }
    }
}
