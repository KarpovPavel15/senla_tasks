package com.company.Task1;

import java.util.Arrays;

public class NameWords extends Main {
    public static void nameWords(String input){
        String lowerText=input.toLowerCase();
        lowerText = lowerText.replaceAll("\\p{Punct}","");
        String[] words = lowerText.split("\\s");
        Arrays.sort(words);
        for(String subStr:words) {

            System.out.println(subStr);
        }
    }
}
