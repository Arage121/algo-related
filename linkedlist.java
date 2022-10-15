package com.algorithms;
// first ever linked list program to print all the values of linked list by using the help of head
public class linkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }

    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        rprint(head);
    }
        public static void rprint(Node head){ // recursive way to print all the node data's in list
            if(head == null) return ;
            System.out.print(head.data + " ");
            rprint(head.next);
        }
    /*public static void print(Node head){ // normal way to print
       Node curr = head;
       while(curr != null){
           System.out.print(curr.data + " ");
           curr = curr.next;
       }*/
    }
    }


