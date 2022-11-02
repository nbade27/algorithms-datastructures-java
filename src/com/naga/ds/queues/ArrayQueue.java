package com.naga.ds.queues;

import java.util.NoSuchElementException;

public class ArrayQueue {

    public Employee[] queue;
    int front;
    int back;

    public ArrayQueue(int capacity){
        queue = new Employee[capacity];
    }

    public void add(Employee employee){
        if(queue.length == back){
            Employee[] newArray = new Employee[2 * queue.length];
            System.arraycopy(queue,0,newArray,0,queue.length);
            queue = newArray;
        }

        queue[back] = employee;
        back++;
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Employee newEmployee = queue[front];
        queue[front] = null;
        front++;

        if(size()==0){
            front =0;
            back = 0;
        }
        return  newEmployee;
    }

    public int size(){
        return back - front;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        return queue[front];

    }



    public void printQueue(){
        for (int i = 0; i < queue.length; i++) {
            if(queue[i] != null)
            System.out.println(queue[i]);
        }
    }

}
