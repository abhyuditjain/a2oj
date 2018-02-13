package com.company.codeforces.div2a;

import java.util.Scanner;

public class PetyaAndStrings {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        System.out.println(compare(first, second));
    }

    private static int compare(String first, String second) {
        int res = first.compareToIgnoreCase(second);
        if (res == 0) {
            return 0;
        }
        return res/Math.abs(res);
    }
}
