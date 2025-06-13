/*Stack using array with Push,Pop,Peek,Display and 
Sum of elements using Data Structure concepts*/

class Stack{
    int top=-1;
    int[] arr=new int[3];
    public void push(int data){
        if(top==arr.length-1){
            resize();
        }
        top++;
        arr[top]=data;
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Popped: "+arr[top]);
            arr[top]=0;
            top--;
    }
    }

    public void peek(){
        System.out.println("Top: "+arr[top]);
    }

    public void resize(){
        int[] temp=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;
    }

    public void sum(){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum is: "+sum);
    }

    public void display(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.print("Stack: ");
            for(int i=0;i<=top;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}

public class StackArray
{
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
	    s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		s.push(100);
		s.display();
		s.pop();
		s.display();
		s.peek();
		s.display();
		s.sum();
}
}
