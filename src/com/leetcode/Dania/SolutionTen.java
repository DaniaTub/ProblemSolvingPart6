package com.leetcode.Dania;
//Majority ELement/

import java.util.Arrays;
import java.util.Hashtable;

public class SolutionTen
{
    public int majorityElement(int[] nums)
    {
        Arrays.sort(nums);
        return nums[nums.length/2];



    }
}
