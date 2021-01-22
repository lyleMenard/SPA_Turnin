package src;

import java.util.*;

public class MyStack {
    ArrayList<Integer> myStack;

    public MyStack(ArrayList<Integer> myStack) {
        this.myStack = myStack;
    }


    //Add to the end of the stack o(1)
    public void push(Integer k) {
        this.myStack.add(k);
    }

    //Take "first" (last element in list) element out and return it

    public int pop(){


        //get last item
        int last = this.myStack.get(this.myStack.size()-1);

        //remove it
        this.myStack.remove(this.myStack.size()-1);

        //return it
        return last;
    }
}