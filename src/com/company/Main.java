package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
       System.out.println( workingVersion());
    }
    private static String workingVersion() {
        Random rnd = new Random();
        Integer x;
        String output = "";
        for (x = 1; x <= 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                output+="FizzBuzz\n";
            } else if (x % 5 == 0) {
                output+="Buzz\n";
            } else if (x % 3 == 0) {
                output+="Fizz\n";
            } else output+=x.toString() + "\n";
            //toString converts integer to string
        }return output;
    }
}
