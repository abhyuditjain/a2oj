package com.company.codeforces.div2a;

import java.util.Arrays;
import java.util.Scanner;

public class Twins {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] values = scanner.nextLine().split(" ");

        int[] val = new int[values.length];

        for (int i = 0; i < val.length; i++) {
            val[i] = Integer.parseInt(values[i]);
        }

        System.out.println(getMinimumCoins(val));
    }

    private static int getMinimumCoins(int[] val) {
        Arrays.sort(val);

        int sum = 0;

        for (int s : val) {
            sum += s;
        }

        int min = 0;
        for (int i = val.length - 1; i >= 0; i--) {
            min += val[i];

            if (min > sum / 2) {
                return val.length - i;
            }
        }

        return val.length;
    }
}
