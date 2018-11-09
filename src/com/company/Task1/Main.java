package com.company.Task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input text");
        String input=scanner.nextLine();
        int c= CountWords.countWords(input);
        NameWords.nameWords(input);
        System.out.println("You enter "+c+"words");
    }
}
