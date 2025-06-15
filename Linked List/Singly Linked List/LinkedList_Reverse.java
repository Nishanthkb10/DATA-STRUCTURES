/*Singly linked List that performs insertion,
deletion, display of values and Reverse of the List*/

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
	}
}

class List {
	Node head,tail;

	public void insert(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=n;
			tail=n;
		}
		else {
			tail.next=n;
			tail=n;
		}
	}

	public void delatend() {
		Node temp=head;
		if(temp==null){
		    System.out.println("List is empty");
		}
		if(head==tail){
		    head=null;
		    tail=null;
		    return;
		}
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
	}

    public void reverse(){
        Node current,prev,next;
        current=head;
        prev=null;
        next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }

	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
		    System.out.print("List values are: ");
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}

public class LinkedList_Reverse
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		List l=new List();
		int n,x,pos;
		do{
		    System.out.println("1.Insert\n2.Delete\n3.Reverse\n4.Display\n5.Exit");
		    System.out.println("Enter your choice: ");
		    n=sc.nextInt();
		    switch(n){
		        case 1:
		            System.out.println("Enter the value: ");
		            x=sc.nextInt();
		            l.insert(x);
		            break;
		        case 2:
		            l.delatend();
		            break;
		        case 3:
		            l.reverse();
                    System.out.println("Reversed List: ");
                    l.display();
		            break;
		        case 4:
                    l.display();
		            break;
                case 5:
                    System.out.println("Exiting...");
                    return;
		    }
		}while(n<=5);
	}
}
