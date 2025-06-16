/*Queue using linked List that performs Enqueue,
Dequeue and display of values*/

import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int data) {
		this.data=data;
	}
}

class Queue {
	Node head,tail;
	
    public boolean isEmpty(){
        if(head==null && tail==null){
            return true;
        }
        return false;
    }
	public void Enqueue(int data) {
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
	public void Dequeue() {
	    Node temp=head;
		if(isEmpty()){
		    System.out.println("Queue is empty");
		    return;
		}
		else{
		head=head.next;
	}
}

	public void display() {
		Node temp=head;
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			return;
		}
		else {
		    System.out.print("Queue values are: ");
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}

public class Queue_LinkedList
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Queue q=new Queue();
		int n,x,pos;
		q.Dequeue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.display();
		q.Dequeue();
		q.Dequeue();
		q.display();
		q.Enqueue(60);
		q.Enqueue(70);
		q.display();
	}
}
