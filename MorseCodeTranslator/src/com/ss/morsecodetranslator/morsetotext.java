package com.ss.morsecodetranslator;

public class morsetotext {
    String in;

    public static void check(String in) {
        String stg;
        if (in != null) {
            stg = String.valueOf(in.charAt(0));
            for (int i = 1; i < in.length(); i++) {
                if (in.charAt(i) == '/') {
                    // check with morsecode
                    System.out.println(stg);
                    stg = String.valueOf(in.charAt(i + 1));
                    i += 1;
                } else {
                    stg = stg + in.charAt(i);
                }
            }
            System.out.println(stg);
        }
    }
}
