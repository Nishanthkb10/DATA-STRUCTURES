
/*Getting Maximum size of the Stack and performing 
Stack operations*/

import java.util.*;
class Stack{
    int top=-1;
    int[] arr;
    public void size(int val){
    arr=new int[val];
    }

    public void push(int data){
        if(top==arr.length-1){
            System.out.println("Stack is full");
        }
        top++;
        arr[top]=data;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped element is: "+arr[top]);
            arr[top]=0;
            top--;
    }
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.print("Contents of the Stack: ");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class StackPractice_StackSize
{
	public static void main(String[] args) {
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the maximum size of the stack: ");
		int siz=sc.nextInt();
		s.size(siz);
		do{
		    System.out.println("Choice 1 : Push\nChoice 2 : Pop\nChoice 3 : Display\nAny other choice : Exit");
		    System.out.println("Enter your Choice: ");
		    n=sc.nextInt();
		    switch(n){
		        case 1:
		            System.out.println("Enter the element to be pushed: ");
		            int x=sc.nextInt();
                    s.push(x);
		            break;
		        case 2:
		            s.pop();
		            break;
		        case 3:
		            s.display();
		            break;
		        default:
		        return;
		    }
		}while(n<=3);
		
}
}
