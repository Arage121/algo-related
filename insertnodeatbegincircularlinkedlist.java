package com.algorithms;

public class insertnodeatbegincircularlinkedlist {
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
        insertatbegin(head, 35);
        System.out.println();
        rprint(head);
    }
    public static Node insertatbegin(Node head, int x){
        Node curr = new Node(x);
        if(head == null){
            curr.next = curr;
            return curr;
        }
        /**else{  // naive method for inserting at beginning of circular linked list
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = curr;
            curr.next = head;
        }
        return curr;**/
        else{
            curr.next = head.next;
            head.next = curr;
            int t = head.data;       // swapping adjacent nodes data so that we don't have to change adresses
            head.data = curr.data;
            curr.data = t;
            return head;
        }
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
        }
}}
