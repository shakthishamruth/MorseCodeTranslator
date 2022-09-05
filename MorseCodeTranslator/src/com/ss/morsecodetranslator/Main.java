package com.ss.morsecodetranslator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int c;
        String s;
        boolean running = true;
        while (running) {
            System.out.print("\n\n0.Exit\n1.Morse to txt\n2.Txt to morse\nchoice:");
            c = get.nextInt();
            switch (c) {
                case 0:
                    running = false;
                    System.out.println("Exit!");
                    break;
                case 1:
                    //System.out.print("Enter morse code:");
                    //s = get.next();
                    //morsetotext.check(s);
                    System.out.println("Code not Complete!");
                    break;
                case 2:
                    System.out.print("Enter txt:");
                    s = get.next();
                    texttomorse.check(s);
                    break;
            }
        }
        get.close();
    }
}