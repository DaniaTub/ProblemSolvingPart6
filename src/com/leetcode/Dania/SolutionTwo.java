package com.leetcode.Dania;

import java.util.Stack;

//Remove Outermost Parentheses
public class SolutionTwo
{
    public String removeOuterParentheses(String s)
    {
        Stack<String> stack = new Stack<>(); //define a stack
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i)+"").equals("("))
            { //check the first parse.
                if (!stack.empty())
                {
                    res += "(";
                }
                stack.push("(");
            }
            else
            {
                if(stack.peek().equals("("))
                {
                    stack.pop();
                    if(!stack.empty())
                    {
                        res += ")";
                    }
                }
            }
        }
        return res;

    }
}
