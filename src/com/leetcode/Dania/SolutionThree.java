package com.leetcode.Dania;

import java.util.Stack;

// Backspace String Compare
public class SolutionThree
{
    public boolean backspaceCompare(String s, String t)
    {
            return compute(s).equals(compute(t));
        }

        private Stack<Character> compute (String S)
        {
            Stack<Character> stack = new Stack();
            for (char c : S.toCharArray())
            {
                if (c != '#')
                {
                    stack.push(c);
                }
                else if (!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            return stack;
        }


}
