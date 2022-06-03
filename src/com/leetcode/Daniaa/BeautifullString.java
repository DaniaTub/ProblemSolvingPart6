package com.leetcode.Daniaa;

import java.util.HashMap;

public class BeautifullString {
    boolean solution(String inputString)
    {
        HashMap<Character,Integer> track=getCounter(inputString);
        int first=(int) 'a';
        int last =(int) 'z';
        int prev=Integer.MAX_VALUE;
        for(int let=first;let<=last;let++)
        {
            int count;
            if(track.containsKey((char)let))
            {
                count=track.get((char)let);
            }
            else
            {
                count=0;
            }
            if(count>prev) return false;
            prev=count;
        }
        return true;
    }

    HashMap<Character,Integer> getCounter(String n)
    {
        HashMap<Character,Integer> h=new HashMap<Character,Integer>();
        int size=n.length();
        for(int i=0;i<size;i++)
        {
            char l =n.charAt(i);
            if(h.containsKey(l))
            {
                h.put(l, h.get(l)+1);
            }
            else
            {
                h.put(l,1);
            }
        }
        return h;
    }

}
