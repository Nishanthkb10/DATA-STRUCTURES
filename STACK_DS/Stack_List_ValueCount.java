/*Stack using Linked List and perform Stack operations along
with counting the total elements in list*/

import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top=null;
    
    public void push(int data){
        Node n=new Node(data);
        n.next=top;
        top=n;
    }
    
    public void pop(){
        if(top==null){
            System.out.println("There is no elements in the stack");
        }
        else{
        System.out.println("Popped element is: "+top.data);
        top.data=0;
        top=top.next;
    }
    }
    
    public void count(){
        Node temp=top;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Number of elements in the linked list is: "+count);
    }
    
    public void display(){
        Node temp=top;
        if(top.data==0){
            System.out.println("Stack Contents are {}");
        }
        else{
        System.out.print("Stack: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    }
}

public class Stack_List_ValueCount
{
	public static void main(String[] args) {
	    int n;
	    Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		System.out.println("Choice 1 --- push\nChoice 2 --- pop\nChoice 3 --- display\nChoice 4 --- count\nAny other choice --- exit");
		do{
		System.out.println("Enter your choice");
		n=sc.nextInt();
		switch(n){
		    case 1:
		        System.out.println("Enter the data to be pushed: ");
		        int x=sc.nextInt();
		        s.push(x);
		        break;
		    case 2:
		        s.pop();
		        break;
		    case 3:
		        s.display();
		        break;
		    case 4:
		    s.count();
		    break;
		    default:
		    System.out.println("END");
		    return;
		}
	}while(n<=4);
	}
}
