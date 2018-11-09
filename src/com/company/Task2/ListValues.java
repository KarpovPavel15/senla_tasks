package com.company.Task2;
import java.util.List;
import java.util.ArrayList;

public class ListValues {
    public static List<Integer> List(int t)
    {
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            if (i % 2 == 0) {
                mylist.add(i);
                i++;
            }
            else i++;

        }
        return mylist;
    }

}
