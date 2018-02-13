package com.company.codeforces.div2a;

/**
 * Petya started to attend programming lessons. On the first lesson his task was to write a simple program. The program was supposed to do the following: in the given string, consisting if uppercase and lowercase Latin letters, it:

 deletes all the vowels,
 inserts a character "." before each consonant,
 replaces all uppercase consonants with corresponding lowercase ones.
 Vowels are letters "A", "O", "Y", "E", "U", "I", and the rest are consonants. The program's input is exactly one string, it should return the output as a single string, resulting after the program's processing the initial string.

 Help Petya cope with this easy task.

 Input
 The first line represents input string of Petya's program. This string only consists of uppercase and lowercase Latin letters and its length is from 1 to 100, inclusive.

 Output
 Print the resulting string. It is guaranteed that this string is not empty.
 */

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
