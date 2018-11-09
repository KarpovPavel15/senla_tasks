package com.company.Task2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data");
        int t = scanner.nextInt();
        List<Integer> mylist=ListValues.List(t);
        SumListValues.Sum(mylist);

    }
}
