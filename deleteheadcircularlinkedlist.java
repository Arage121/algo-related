package com.algorithms;

public class deleteheadcircularlinkedlist {
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
        head.next.next.next = head;
        rprint(head);
        deletehead(head);
        System.out.println();
        rprint(head);
    }
    public static Node deletehead(Node head){
        if(head == null || head.next == head) return null;
            head.data = head.next.data;
            head.next = head.next.next;
        return head;
        }

    public static void rprint(Node head){ // recursive way to print all the node data's in list
        /**if(head == null) return ;
         System.out.print(head.data + " ");
         rprint(head.next);**/
        if(head == null) return ;                // print method for circular linked list
        System.out.print(head.data + " ");
        Node curr = head.next;
        while(curr != head){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }}
}
