package com.company.codeforces.div2a;

import java.util.Scanner;

public class Watermelon {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int w = scanner.nextInt();

        if (w > 2 && w % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
