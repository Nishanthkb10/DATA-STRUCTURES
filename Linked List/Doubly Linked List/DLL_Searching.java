/*Searching the element from Doubly Linked list*/

import java.util.*;
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class List {
    Node head, tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public void insertlast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

 public void search(int value) {
        int c = 1;
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Value found at position " + c);
                return;
            }
            temp = temp.next;
            c++;
        }
        System.out.println("Value not found in the list.");
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class DLL_Searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List l = new List();
         System.out.println("Insert at last");
        l.insertlast(120);
        l.insertlast(10);
        l.insertlast(50);
        l.insertlast(40);
        l.insertlast(122);
        l.display();
        System.out.println("Enter Element to Search: ");
        int n=sc.nextInt();
        l.search(n);
    }
}
