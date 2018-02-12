package com.company.codeforces.div2a;

import java.util.Scanner;

public class WayTooLongWords {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();

        while (n-- > 0) {
            String word = scanner.nextLine();
            StringBuilder s = new StringBuilder();

            if (word.length() > 10) {
                int count = word.length() - 2;
                s.append(word.charAt(0));
                s.append(Integer.toString(count));
                s.append(word.charAt(word.length() - 1));

                System.out.println(s.toString());
            } else {
                System.out.println(word);
            }
        }
    }
}
