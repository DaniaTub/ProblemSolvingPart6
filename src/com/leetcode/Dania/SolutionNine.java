package com.leetcode.Dania;

public class SolutionNine {
   /* function numOfPathsToDest(n):

    # allocate a 2D array for memoization
    memo = [][]

    # the memoization array is initialized with -1
    # to indicate uncalculated squares.
          for i from 0 to n-1:
            for j from 0 to n-1:
                memo[i][j] = -1

           return numOfPathsToSquare(n-1, n-1, memo)


     # input:
            #    i, j - a pair of non-negative integer coordinates
     #    memo - a 2D memoization array.
            # output:
            #    number of paths from (0,0) to the square represented in (i,j),

     function numOfPathsToSquare(i, j, memo):
            if (i < 0 OR j < 0):
            return 0
            else if (i < j):
       memo[i][j] = 0
            else if (memo[i][j] != -1):
            return memo[i][j]
            else if (i == 0 AND j == 0):
       memo[i][j] = 1
            else:
       memo[i][j] = numOfPathsToSquare(i, j -1, memo) +
       numOfPathsToSquare(i - 1, j, memo)

        return memo[i][j]*/



   // -------------------------------------------------


  /* function numOfPathsToDest(n):

            if (n == 1):
            return 1

    lastRow = []
            for i from 1 to n-1:
    lastRow[i] = 1 # base case - the first row is all ones

    currentRow = []

            for j from 1 to n-1:
            for i from j to n-1:
            if (i == j):
    currentRow[i] = lastRow[i]
            else:
    currentRow[i] = currentRow[i-1] + lastRow[i]
    lastRow = currentRow

    return currentRow[n-1]*/
}
