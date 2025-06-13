/*Stack performing insert,delete,access peek and
display the elements*/

import java.util.*;

class Stack{
    int top=-1;
    int[] arr=new int[5];

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

public class StackArray_Practice
{
	public static void main(String[] args) {
		Stack s=new Stack();
		Scanner sc=new Scanner(System.in);
		int n;
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
