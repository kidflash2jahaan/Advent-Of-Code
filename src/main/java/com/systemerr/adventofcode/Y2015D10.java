package com.systemerr.adventofcode;

public class Y2015D10 {
    public static String puzzleInput = "1113222113";

    public static void main(String[] args) {
        S1();
        S2();
    }

    public static void S1() {
        String result = puzzleInput;
        for (int i = 0; i < 40; i++) {
            String tempResult = "";
            int tempNumber = Integer.parseInt(String.valueOf(result.charAt(0)));
            int tempCount = 1;
            for (int charIndex = 1; charIndex < result.toCharArray().length; charIndex++) {
                if (Integer.parseInt(String.valueOf(result.charAt(charIndex))) == tempNumber) {
                    tempCount++;
                } else {
                    tempResult += String.valueOf(tempCount) + String.valueOf(tempNumber);
                    tempNumber = Integer.parseInt(String.valueOf(result.charAt(charIndex)));
                    tempCount = 1;
                }
            }
            tempResult += String.valueOf(tempCount) + String.valueOf(tempNumber);
            result = tempResult;
        }
        System.out.println("S1: " + result.length());
    }

    public static void S2() {

    }
}
