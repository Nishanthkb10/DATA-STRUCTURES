import java.util.*;
class Queue{
    int f,r=-1;
    int[] arr;
    Queue(int size){
        arr=new int[size];
    }
    
    public boolean isEmpty(){
        if(f==-1 && r==-1)return true;
        return false;
    }
    
    public boolean isFull(){
        if(r==arr.length-1)return true;
        return false;
    }
    
    public void enQueue(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        else if(f==-1 && r==-1){
            f=0;
            r=0;
        }
        else{
            r++;
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
            f++;
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
        else{
            System.out.print("Queue: ");
        for(int i=f;i<=r;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
}

public class Queue_Array
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size for the queue");
	    int n=sc.nextInt();
		Queue q=new Queue(n);
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(50);
		q.display();
		q.deQueue();
		q.deQueue();
		System.out.println("After Deletion ");
		q.display();
		System.out.println("Front: "+q.front());
		System.out.println("Rear: "+q.rear());
	}
}
