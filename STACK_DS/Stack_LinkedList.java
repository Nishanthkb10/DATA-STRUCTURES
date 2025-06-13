/*Stack concept using Linked list where Push, Pop, Display and
Accessing of Top element is done with DS concepts*/

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
        System.out.println("Popped: "+top.data);
        top.data=0;
        top=top.next;
    }

    public void peek(){
        System.out.println("Top: "+top.data);
    }

    public void display(){
        Node temp=top;
        System.out.print("Stack: ");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}

public class Stack_LinkedList
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.display();
		s.pop();
		s.display();
		s.peek();
		
	}
}
