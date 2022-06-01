package com.leetcode.Dania;

import java.util.HashSet;

public class SolutionEight
{
    public boolean checkValid(int[][] matrix)
    {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> r_set = new HashSet();
            HashSet<Integer> c_set = new HashSet();
            for (int j = 0; j < n; j++) {

                r_set.add(matrix[i][j]) ;
                c_set.add(matrix[j][i]) ;
            }
            if (r_set.size() != n || c_set.size() != n)
                return false;
        }
        return true;

    }


    }


