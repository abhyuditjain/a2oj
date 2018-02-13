package com.company.codeforces.div2a;

/**
 * Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
 * <p>
 * Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.
 * <p>
 * Input
 * The single line contains an integer n (1 ≤ n ≤ 1000) — the number that needs to be checked.
 * <p>
 * Output
 * In the only line print "YES" (without the quotes), if number n is almost lucky. Otherwise, print "NO" (without the quotes).
 */

import java.util.*;

public class LuckyDivision {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();

        System.out.println(isAlmostLucky(n));
    }

    private static String isAlmostLucky(int n) {
        Set<Integer> luckyTill1000 = new HashSet<>(Arrays.asList(4, 7, 47, 74, 447, 474, 477, 744, 747, 774));

        Iterator<Integer> i = luckyTill1000.iterator();

        while (i.hasNext()) {
            if (n % i.next() == 0) {
                return "YES";
            }
        }

        return "NO";
    }
}
