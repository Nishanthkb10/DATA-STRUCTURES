import java.util.*;
class Queue{
    int f=-1,r=-1;
    int[] arr;
    int N;
    Queue(int size){
        arr=new int[size];
        N=arr.length;
    }
    
    public boolean isEmpty(){
        if(f==-1 && r==-1)return true;
        return false;
    }
    
    public boolean isFull(){
        if((r+1)%N==f)return true;
        return false;
    }
    
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else if(isEmpty()){
            f=0;
            r=0;
        }
        else{
            r=(r+1)%N;
        }
        arr[r]=data;
    }
    
    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        else if(f==r){
            f=-1;
            r=-1;
        }
        else{
            f=(f+1)%N;
        }
    }
    
    public int front(){
        if(isEmpty()){
            System.out.println("No Front found.Queue is Empty");
            return 0;
        }
        else{
            return arr[f];
        }
    }
    
    public int rear(){
        if(isEmpty()){
            System.out.println("No Rear found.Queue is Empty");
            return 0;
        }
        else{
            return arr[r];
        }
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        int i=f;
        while(true){
            System.out.print(arr[i]+" ");
            if(i==r)break;
            i=(i+1)%N;
        }
    }
}

public class CircularQueue_Array
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter initial size for Circular Queue ");
	    int n=sc.nextInt();
		Queue q=new Queue(n);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		System.out.print("After Initial Insertion: ");
		q.display();
		System.out.print("\nDeletion.. ");
		q.deQueue();
		q.deQueue();
		System.out.print("\nAfter Deletion: ");
		q.display();
		System.out.print("\nFront: "+q.front());
		System.out.print("\nRear: "+q.rear());
		System.out.print("\nInsertion as Circular Queue ");
		q.enQueue(60);
		q.enQueue(70);
		q.display();
		System.out.print("\nFront: "+q.front());
		System.out.print("\nRear: "+q.rear());
	}
}
