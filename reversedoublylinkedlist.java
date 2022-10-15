package com.algorithms;

public class reversedoublylinkedlist {
    public static class Node{
        int data;
        Node prev;
        Node next;
        Node(int d){
            data = d;
            prev = next = null;
        }
    }
    public static void main(String[] args){
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        rprint(head);
        System.out.println();
        head = reverse(head);
        rprint(head);
    }
    public static Node reverse(Node head){
        if(head == null || head.next == null) return head;
       Node temp = null, curr = head;
       while(curr != null){
           temp = curr.prev;  // for swapping prev and next functionality
           curr.prev = curr.next;
           curr.next = temp;
           curr = curr.prev; // to come towards the next node as prev has become next now
       }
       return temp.prev;
    }
    public static void rprint(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        rprint(head.next);
    }
}
