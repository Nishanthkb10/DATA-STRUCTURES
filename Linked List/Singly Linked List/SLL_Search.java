/*Search Elements from List*/

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
    
    public void search(int data){
        Node temp=head;
        int count=1;
        while(temp!=null){
            if(temp.data==data){
                System.out.println("Position is: "+count);
                break;
            }
            temp=temp.next;
            count++;
        }
        count=0;
        if(temp==null && count==0){
            System.out.println("Element not found");
        }
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

public class SLL_Search
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		List l=new List();
		l.insert(10);
		l.insert(20);
		l.insert(30);
		l.insert(40);
		l.insert(50);
		System.out.println("Initial insertion in List");
 		l.display();
        System.out.println("Enter number to search");
        int n=sc.nextInt();
        l.search(n);
	}
}
