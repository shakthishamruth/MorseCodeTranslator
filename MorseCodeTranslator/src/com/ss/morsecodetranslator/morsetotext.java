package com.ss.morsecodetranslator;

public class morsetotext {
    String in;
    public static void check(String in) {
        String stg;
        stg = String.valueOf(in.charAt(0));
        for (int i = 1; i < in.length(); i++) {
            stg = stg + in.charAt(i);
        }
        System.out.println(stg);

    }
}
