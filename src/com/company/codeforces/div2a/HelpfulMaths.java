package com.company.codeforces.div2a;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String summand = scanner.nextLine();

        System.out.println(help(summand));
    }

    private static String help(String summand) {
        String[] out = summand.split("[+]");
        Arrays.sort(out);
        return String.join("+", out);
    }
}
