package com.algorithms;

public class deletefirstnodeheadlinkedlist {
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
        head = delete(head);
        rprint(head);
    }
    public static Node delete(Node head){
        if(head == null) return null;
        else return head.next;
    }

    public static void rprint(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        rprint(head.next);
    }
}
