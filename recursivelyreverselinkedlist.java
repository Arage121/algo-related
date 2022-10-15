package com.algorithms;

public class recursivelyreverselinkedlist {
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
            rprint(head);
            head = recursivereverse(head);
            System.out.println();
            rprint(head);
        }
        public static void rprint(Node head){ // recursive way to print all the node data's in list
            if(head == null) return ;
            System.out.print(head.data + " ");
            rprint(head.next);
        }
        public static Node recursivereverse(Node head){
        if(head == null) {return head;}
        if(head.next == null) {return head;}
        Node rest_head = recursivereverse(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
        }

}
