package com.systemerr.adventofcode;

import java.security.MessageDigest;

import org.apache.commons.codec.digest.DigestUtils;

public class Y2015D4 {
    public static String puzzleInput = "bgvyzdsv";

    public static void main(String[] args) {
        S1();
        S2();
    }

    public static void S1() {
        String hash;
        int i = 1;
        while (true) {
            hash = DigestUtils.md5Hex(puzzleInput + i);
            if (hash.startsWith("00000")) break;
            i++;
        }
        System.out.println("S1: " + i);
    }

    public static void S2() {

    }
}
