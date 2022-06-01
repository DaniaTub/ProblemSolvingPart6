package com.leetcode.Dania;

import java.util.HashSet;

//HapppyNumber
public class SolutionEleven
{
        public boolean isHappy(int n) {
  if( n ==1 || n==-1)
  {
        return true;
     }

        HashSet<Integer> h = new HashSet<>();

        int m=0;

        while(true)
        {
        while(n != 0)
        {
                m = m + (n%10)*(n%10);
                n=n/10;
        }
        if(m == 1)
        {
                return true;
        }
        if(!h.add(m))
        {
                return false;
        }
        n=m;
        m=0;
}
}



}
        /*HashSet<Integer> st = new HashSet<>();
           while (1)
            {


            n = numSquareSum(n);
            if (n == 1)
            return true;
            if (st.contains(n))
            return false;
            st.add(n);


            }*/