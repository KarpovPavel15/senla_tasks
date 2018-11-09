package com.company.Task2;
import java.util.ArrayList;
import java.util.List;

public class SumListValues {
    public static void Sum(List<Integer> mylist){
        int sumValues = mylist.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Сумма: " + sumValues);
        System.out.println(""+mylist);
    }
}
