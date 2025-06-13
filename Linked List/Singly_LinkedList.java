/*Singly linked List that performs insertion,
deletion and display of values*/

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

	public void insatbeg(int data) {
		Node n = new Node(data);
		n.next=head;
		head=n;
	}

	public void insatspec(int pos,int data) {
		Node temp=head;
		Node n=new Node(data);
		for(int i=0; i<pos-2; i++) {
			temp=temp.next;
		}
		n.next=temp.next;
		temp.next=n;
	}

	public void delatbeg() {
	    Node temp=head;
		if(temp==null){
		    System.out.println("List is empty");
		}
		else{
		head=head.next;
	}
}
	public void delatspec(int pos) {
		Node temp=head;
		if(temp==null){
		    System.out.println("List is empty");
		}
		else{
		for(int i=0; i<pos-2; i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
}
	public void delatend() {
		Node temp=head;
		if(temp==null){
		    System.out.println("List is empty");
		}
		else{
		while(temp.next!=tail) {
			temp=temp.next;
		}
		temp.next=null;
	}
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

public class Singly_LinkedList
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		List l=new List();
		int n,x,pos;
		do{
		    System.out.println("1.Insert at end\n2.Insert at Beg\n3.Insert at position\n4.Delete at end\n5.Delete at Beg\n6.Delete at position\n7.Display\n8.Exit");
		    System.out.println("Enter your choice: ");
		    n=sc.nextInt();
		    switch(n){
		        case 1:
		            System.out.println("Enter the value: ");
		            x=sc.nextInt();
		            l.insert(x);
		            break;
		        case 2:
		            System.out.println("Enter the value: ");
		            x=sc.nextInt();
		            l.insatbeg(x);
		            break;
		        case 3:
		            System.out.println("Enter the position and value: ");
		            pos=sc.nextInt();
		            x=sc.nextInt();
		            l.insatspec(pos,x);
		            break;
		        case 4:
		            l.delatend();
		            break;
		        case 5:
		            l.delatbeg();
		            break;
		        case 6:
		            System.out.println("Enter the position to delete: ");
		            pos=sc.nextInt();
		            l.delatspec(pos);
		            break;
		        case 7:
		            l.display();
		            break;
		        case 8:
		            return;
		    }
		}while(n<=8);
	}
}
