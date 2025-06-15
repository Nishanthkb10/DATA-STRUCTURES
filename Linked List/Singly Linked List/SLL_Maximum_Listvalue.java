/*Singly Linked List that finds the Maximum element from the list*/

import java.io.*;

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
    
    public void max(){
        Node temp=head;
        int max=temp.data;
        while(temp!=null){
            if(temp.data>=max){
                max=temp.data;
            }
            temp=temp.next;
        }
        System.out.println("Maximum is : "+max);
    }
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
}

public class SLL_Maximum_Listvalue
{
	public static void main(String[] args) {
		List l=new List();
		l.insert(10);
		l.insert(20);
		l.insert(60);
		l.insert(40);
		l.insert(50);
		System.out.println("Initial insertion in List");
		l.display();
        l.max();
	}
}
