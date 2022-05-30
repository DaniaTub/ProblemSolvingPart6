package com.leetcode.Dania;

import java.util.HashSet;

public class SolutionEight
{
    public boolean checkValid(int[][] matrix)
    {
        HashSet<Integer> myset=new HashSet<>();


        for(int i=0;i<matrix.length;i++)
        {
            for(int j=1;j<=matrix.length;j++)
            {
                myset.add(j);
            }
            for(int j=0;j<matrix.length;j++)
            {
                if(myset.contains(matrix[i][j]))
                {
                    myset.remove(matrix[i][j]);
                }
                else
                {
                    return false;
                }
            }
            myset.clear();
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=1;j<=matrix.length;j++)
            {
                myset.add(j);
            }
            for(int j=0;j<matrix.length;j++)
            {
                if(myset.contains(matrix[j][i]))
                {
                    myset.remove(matrix[j][i]);
                }
                else
                {
                    return false;
                }
            }
            myset.clear();
        }
        return true;
    }



    }


