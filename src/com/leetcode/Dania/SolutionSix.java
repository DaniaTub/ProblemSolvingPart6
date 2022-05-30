package com.leetcode.Dania;

import java.util.Arrays;

//Design a HashSet without using any built-in hash table libraries.
public class SolutionSix
{
    boolean[] arr = new boolean[100];

    public void add(int key)
    {
        if(key>=arr.length)
            extend(key);
           arr[key]=true;
    }

    public void remove(int key)
    {
        if(key>=arr.length) // if array is too small to accomodate key, extend it.
            extend(key);
            arr[key]=false;
    }

    public boolean contains(int key)
    {
        if(key>=arr.length) // key cannot be in array if array's length < key
            return false;
        return arr[key]==true;
    }
    public void extend(int key){
        arr= Arrays.copyOf(arr, key+2);  // extend array to one more item than necessary, we need "key" items.
        // we give "key+1" items to reduce collisions.
    }

}
