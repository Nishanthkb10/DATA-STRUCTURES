/*The Singly Linked List implementation where Values are Sorted and arranged in order
by getting inputs from User and Displays them*/

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

	public void sort(){
	    if(head==null){
	        System.out.println("Desktop is Empty");
	    }
	    else{
	        boolean swap=true;
	        Node end=null;
	        while(swap){
	            Node current=head;
	            swap=false;
	            while(current.next!=end){
	                if(current.data>current.next.data){
	                    int temp=current.data;
	                    current.data=current.next.data;
	                    current.next.data=temp;
	                }
	                current=current.next;
	            }
	            end=current;
	        }
	    }
	}
	public void display() {
		Node temp=head;
		if(head==null) {
			System.out.println("Desktop is Empty");
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

public class SLL_Sorting
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		List l=new List();
		int x;
		do{
		    System.out.println("1.Enter a new file\n2.View desktop\n3.Arrange in order\n4.Exit");
		    System.out.println("Enter your choice");
		    x=sc.nextInt();
		    switch(x){
		        case 1:
		            int file;
		            do{
		            System.out.println("Enter the file");
		            file=sc.nextInt();
		            }while(file>0 && file>100);
		            l.insert(file);
		            break;
		        case 2:
		            l.display();
		            break;
		        case 3:
		            l.sort();
		            l.display();
		            break;
		        case 4:
		            return;
		    }
		}while(x!=4);
		
	}
}
