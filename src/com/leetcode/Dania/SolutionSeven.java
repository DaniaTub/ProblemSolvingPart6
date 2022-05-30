package com.leetcode.Dania;
//Design a HashMap without using any built-in hash table libraries.


import java.util.Arrays;

public class SolutionSeven
{
    int [] map=new int[1000001];
       // Arrays.fill(map,-1);

    public void put(int key, int value)
    {
        map[key]=value;
    }

    public int get(int key)
    {
        return map[key];
    }

    public void remove(int key)
    {
        map[key]=-1;
    }
}
