package com.leetcode.Daniaa;
///sort by most freq character

import java.util.HashMap;
import java.util.PriorityQueue;

public class SolutionOne
{
    public String frequencySort(String s) {

        if(s.length()==0 || s==null)
        {
            return s;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++)

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);

        PriorityQueue<Character> maxHeap= new PriorityQueue<>((a, b)-> map.get(b)- map.get(a));
        //Add all the values to the maxHeap
        maxHeap.addAll(map.keySet());

        //Now extract and add it to the result
        StringBuilder res= new StringBuilder();

        while(!maxHeap.isEmpty()){

            char curr= maxHeap.remove();
            //add this character according to the frequency at which it occurs
            for(int i=0; i<map.get(curr); i++)
                res.append(curr);
        }
        return res.toString();

    }



}
