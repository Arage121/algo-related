package com.algorithms;

public class insertatstartindoublylinkedlist {
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
        head = insertatstart(head, 5);
        rprint(head);
    }
    public static Node insertatstart(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        if(head != null){
            head.prev = temp;
        }
        return temp;
    }
    public static void rprint(Node head){
        if(head == null) return;
        System.out.print(head.data + " ");
        rprint(head.next);
    }
}
