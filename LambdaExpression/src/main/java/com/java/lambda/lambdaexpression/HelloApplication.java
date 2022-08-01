package com.java.lambda.lambdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data
{
    private String name;

    public Data(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "Data[name = "+name+"]";
    }
}


public class HelloApplication  {


    public static void main(String[] args) {
        List<Data> list= new ArrayList<>();

        list.add(new Data("arpit"));
        list.add(new Data("mojojojo"));
        list.add(new Data("racloop"));


        Collections.sort(list,(Data o1, Data o2)->o1.getName().compareTo(o2.getName()));
//
//        Collections.sort(list, new Comparator<Data>() {
//            @Override
//            public int compare(Data o1, Data o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        for(Data data:list)
        {
            System.out.println(data.getName());
        }
    }
}