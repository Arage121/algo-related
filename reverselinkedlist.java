package com.algorithms;

public class reverselinkedlist {
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
            head = recursivereverse(head,null);
            System.out.println();
            rprint(head);
        }
        public static void rprint(Node head){ // recursive way to print all the node data's in list
            if(head == null) return ;
            System.out.print(head.data + " ");
            rprint(head.next);
        }
        /**public static Node reverse(Node head){
            Node curr = head;
            Node prev = null;
            while(curr != null){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }**/
        public static Node recursivereverse(Node curr, Node prev){
            if(curr == null) return prev;
            Node next = curr.next;
            curr.next = prev;
            return recursivereverse(next, curr);
        }
    }
}
