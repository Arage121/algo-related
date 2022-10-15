package com.algorithms;

public class linkedlistproblem { // print the position of the target when u find it in the linked list
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(findtarget(head, 30));
    }
    public static int findtarget(Node head, int tar){ // recursive method .. once use debugger to understand the function properly
        if(head == null) return -1;

        if(head.data == tar) return 1;
        else{
            int res = findtarget(head.next, tar);
            if(res == -1) return -1;
            else return res+1;
        }
    }
}
