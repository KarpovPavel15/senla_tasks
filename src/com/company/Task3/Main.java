package com.company.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data");
        int t = scanner.nextInt();
        int v = scanner.nextInt();
        int b = scanner.nextInt();
        generator.combination(t, v, b).stream().distinct().forEach(System.out::println);
    }
}
