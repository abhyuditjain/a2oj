package com.company.codeforces.div2a;

import java.util.Scanner;
import java.util.Stack;

public class ChatRoom {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        System.out.println(isHello(input));
    }

    private static String isHello(String input) {
        Stack<Character> hello = new Stack<>();
        hello.push('o');
        hello.push('l');
        hello.push('l');
        hello.push('e');
        hello.push('h');

        StringBuilder s = new StringBuilder();

        int i = 0;
        char[] chars = input.toCharArray();

        while (!hello.empty() && i < chars.length) {
            if (hello.peek() == chars[i]) {
                s.append(chars[i]);
                hello.pop();
            }
            i++;
        }

        if (s.toString().compareTo("hello") == 0) {
            return "YES";
        }

        return "NO";
    }
}
