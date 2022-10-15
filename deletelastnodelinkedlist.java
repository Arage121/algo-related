package com.algorithms;

public class deletelastnodelinkedlist {
public static class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }

public static void main(String[] args){
         Node head = new Node(20);
         head.next = new Node(30);
         head.next.next = new Node(50);
         head.next.next.next = new Node(13);
    head.next.next.next.next = new Node(132);
         deletend(head);
         rprint(head);
}
public static Node deletend(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
}

public static void rprint(Node head){
       if(head == null) return;
       System.out.print(head.data + " ");
       rprint(head.next);
}
}
}
