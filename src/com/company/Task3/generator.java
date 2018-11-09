package com.company.Task3;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

 class generator {
    public static List<String> combination(int t,int v, int b) {
    List<Integer> list=Arrays.asList(t,v,b);
    List<String> srtArr=new ArrayList<>();
    for(int i=0;i< list.size();i++)
    {
        for (int j=0;j<list.size();j++)
        {
            for(int k=0;k<list.size();k++)
            {
                srtArr.add("" + list.get(i) + list.get(j) + list.get(k));
            }
        }
    }
        return srtArr;
    }

}
