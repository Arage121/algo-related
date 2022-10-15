package com.algorithms;

public class insertfrombegininginlinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int x){
            data = x;
            next = null;
        }
    }
    public static void main(String[] args){
        Node head = null;
        /*head = insertatbegin(head, 40);
        head = insertatbegin(head, 30);
        head = insertatbegin(head, 10);
        head = insertatbegin(head, 5);
        rprint(head);*/
        head = insertathend(head, 10);
        head = insertathend(head, 20);
        head = insertathend(head, 30);
        head = insertathend(head, 15);
        rprint(head);
    }
    /*public static Node insertatbegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head.next;
        return temp;
    }*/
    public static Node insertathend(Node head, int x){
        Node temp = new Node(x);
        if(head == null) return temp;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static void rprint(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        rprint(head.next);
    }
}
