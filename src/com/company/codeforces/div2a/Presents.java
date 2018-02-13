package com.company.codeforces.div2a;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Little Petya very much likes gifts. Recently he has received a new laptop as a New Year gift from his mother. He immediately decided to give it to somebody else as what can be more pleasant than giving somebody gifts. And on this occasion he organized a New Year party at his place and invited n his friends there.
 * <p>
 * If there's one thing Petya likes more that receiving gifts, that's watching others giving gifts to somebody else. Thus, he safely hid the laptop until the next New Year and made up his mind to watch his friends exchanging gifts while he does not participate in the process. He numbered all his friends with integers from 1 to n. Petya remembered that a friend number i gave a gift to a friend number pi. He also remembered that each of his friends received exactly one gift.
 * <p>
 * Now Petya wants to know for each friend i the number of a friend who has given him a gift.
 * <p>
 * Input
 * The first line contains one integer n (1 ≤ n ≤ 100) — the quantity of friends Petya invited to the party. The second line contains n space-separated integers: the i-th number is pi — the number of a friend who gave a gift to friend number i. It is guaranteed that each friend received exactly one gift. It is possible that some friends do not share Petya's ideas of giving gifts to somebody else. Those friends gave the gifts to themselves.
 * <p>
 * Output
 * Print n space-separated integers: the i-th number should equal the number of the friend who gave a gift to friend number i.
 */

public class Presents {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String inp = scanner.nextLine();

        System.out.println(getFriends(inp));
    }

    private static String getFriends(String inp) {
        String[] str = inp.split(" ");

        int[] friends = new int[str.length];

        for (int i = 0; i < str.length; i++) {
            int index = Integer.parseInt(str[i]) - 1;
            friends[index] = i + 1;
        }

        String[] sarr = Arrays.stream(friends).mapToObj(String::valueOf).toArray(String[]::new);
        return String.join(" ", sarr);
    }
}
