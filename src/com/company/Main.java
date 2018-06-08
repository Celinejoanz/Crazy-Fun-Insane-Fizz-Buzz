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
        if (max == min) {
            return "Shazam";
        }
        if (min > max) {
            return "Oops";
        }
        if (max - min < 10) {
            output = "This won't take long\n";
        }
        for (i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output += "FizzBuzz\n";
            } else if (i % 5 == 0) {
                output += "Buzz\n";
            } else if (i % 3 == 0) {
                output += "Fizz\n";
            } else output += i.toString() + "\n";
            //toString converts integer to string
        }
        return output;
    }
}



