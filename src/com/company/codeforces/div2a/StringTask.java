package com.company.codeforces.div2a;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringTask {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        StringBuilder s = new StringBuilder();

        Set<Character> vowels = new HashSet<Character>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('Y');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        for (Character c : input.toCharArray()) {
            if (vowels.contains(c)) {
                continue;
            }

            s.append('.');
            s.append(c.toString().toLowerCase());
        }

        System.out.println(s.toString());
    }
}
