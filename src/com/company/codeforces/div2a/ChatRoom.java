package com.company.codeforces.div2a;

/**
 * Vasya has recently learned to type and log on to the Internet. He immediately entered a chat room and decided to say hello to everybody. Vasya typed the word s. It is considered that Vasya managed to say hello if several letters can be deleted from the typed word so that it resulted in the word "hello". For example, if Vasya types the word "ahhellllloou", it will be considered that he said hello, and if he types "hlelo", it will be considered that Vasya got misunderstood and he didn't manage to say hello. Determine whether Vasya managed to say hello by the given word s.

 Input
 The first and only line contains the word s, which Vasya typed. This word consisits of small Latin letters, its length is no less that 1 and no more than 100 letters.

 Output
 If Vasya managed to say hello, print "YES", otherwise print "NO".
 */

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
