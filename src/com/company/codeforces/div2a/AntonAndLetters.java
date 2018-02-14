package com.company.codeforces.div2a;

import java.util.Scanner;

/**
 * Recently, Anton has found a set. The set consists of small English letters. Anton carefully wrote out all the letters from the set in one line, separated by a comma. He also added an opening curved bracket at the beginning of the line and a closing curved bracket at the end of the line.
 * <p>
 * Unfortunately, from time to time Anton would forget writing some letter and write it again. He asks you to count the total number of distinct letters in his set.
 * <p>
 * Input
 * The first and the single line contains the set of letters. The length of the line doesn't exceed 1000. It is guaranteed that the line starts from an opening curved bracket and ends with a closing curved bracket. Between them, small English letters are listed, separated by a comma. Each comma is followed by a space.
 * <p>
 * Output
 * Print a single number — the number of distinct letters in Anton's set.
 */

public class AntonAndLetters {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(scanner.nextLine().replaceAll("[{}, ]", "").chars().distinct().count());
    }
}
