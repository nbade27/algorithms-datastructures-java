package com.naga.ds.stacks;

import java.util.EmptyStackException;

public class ArrayStack {
    class Solution {

        public int[] twoSum(int[] nums, int target) {
            target = Math.abs(target);
            int[] output = new int[2];
            int temp = 0;
            for(int i = 0;i < nums.length; i++){

                if(nums[i] <= target){
                    temp = nums[i];
                    temp = Math.abs(temp);
                    for(int j= i+1;j<nums.length;j++){
                        if((temp + Math.abs(nums[j])) == target || (temp + nums[j]) == target){
                            output[0] = i;
                            output[1] = j;
                        }
                    }

                }//if
            }//for

            return output;
        }//method


    }
    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new Employee[capacity];
    }

    public void push(Employee employee) {
        if (top == stack.length) {
            // need to resize the backing array
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }

        stack[top++] = employee;
    }

    public Employee pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public Employee peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return stack[top - 1];
    }

    public int size() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void printStack() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

}
