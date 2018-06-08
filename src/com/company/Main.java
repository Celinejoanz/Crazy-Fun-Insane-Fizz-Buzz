package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(workingVersion());
    }

    private static String workingVersion() {
        Integer x;
        String output = "";
        Random rnd = new Random();
        Integer max;
        Integer min;
        max = rnd.nextInt(100) + 1;
        min = rnd.nextInt(100) + 1;
        Integer i;
        for (i = min; i <= max; i++) {
                if (max == min) {
                    return "Shazam";
                }
                if (i % 3 == 0 && i % 5 == 0) {
                    output += "FizzBuzz\n";
                } else if (i % 5 == 0) {
                    output += "Buzz\n";
                } else if (i % 3 == 0) {
                    output += "Fizz\n";
                } else output += i.toString() + "\n";
                //toString converts integer to string
            }return output;
        }
    }


