package com.ss.morsecodetranslator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int c;
        String s;
        boolean running = true;
        while (running) {
            System.out.print("\n\n0.Exit\n2.Morsetotxt\n3.Txttomorse\nchoice:");
            c = get.nextInt();
            switch (c) {
                case 0:
                    running = false;
                    System.out.println("Exit!");
                    break;
                case 1:
                    System.out.print("Enter morse code:");
                    s = get.next();
                    break;
                case 2:
                    System.out.print("Enter txt:");
                    s = get.next();
                    break;
            }


        }
        get.close();
    }
}