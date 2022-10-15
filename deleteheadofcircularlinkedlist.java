package com.algorithms;

public class deleteheadofcircularlinkedlist {
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
        head = deletehead(head);
        rprint(head);
    }
    public static Node deletehead(Node head){
        if(head == null || head.next == null) return null;
        head = head.next;
        head.prev = null;
        return head;/**
         deletelastnode function given blow-
         if(head == null || head.next == null) return null;
         Node curr = head;
         while(curr.next != null){
         curr = curr.next;
         }
         curr.prev.next = null;
         return head;
         **/
    }
    public static void rprint(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        rprint(head.next);
    }
}
