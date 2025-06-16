import java.util.*;

public class Queue{
	 int front=0,rear=0;
	 int[] arr;
	 int N,size=0;
	 Queue(int n){
		 arr=new int[n];
		 N=arr.length;
	 }

	public void enQueue(int data)
	{
		arr[rear]=data;
		rear=(rear+1)%N;
		size++;
	}

	public int deQueue()
	{
		int temp=arr[front];
	 	front=(front+1)%N;
		size--;
		return temp;
	}
	
	public int front()
    	{
	return arr[front];
	}
}
