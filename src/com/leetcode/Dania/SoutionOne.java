package com.leetcode.Dania;

import java.util.Stack;

//Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
public class SoutionOne
{
    Stack myStack;

    public SoutionOne() {
        myStack = new Stack(); //define the stack
    }

    public void push(int val) {
        myStack.push(val);
    }

    public void pop() {
        myStack.pop();
    }

    public int top() {
        int x = (int) myStack.pop(); //take the first elementm in the stack ..
        myStack.push(x); //then push it again
        return x;
    }

    public int getMin()
    {
        int min = Integer.MAX_VALUE;
        for(Object elem : myStack)
        {
            min = Math.min((Integer) elem, min);
        }
        return min;
    }


}
