import java.util.*;  
public class Main{  
public static void main(String[] args) {  
    int n,j=0,tim=0,i,last;  
    Scanner sc = new Scanner(System.in); 
    n=sc.nextInt();
    Queue q = new Queue(n); 
    int[] a=new int[n];
    int[] b=new int[n];
   
    for(i=0;i<n;i++)
    a[i]=sc.nextInt();
    for(i=0;i<n;i++)
    q.enQueue(a[i]);
    for(i=0;i<n;i++)
    b[i]=sc.nextInt();
     while(j!=n){
        if(q.front()!=b[j]){
            int temp=q.deQueue();
            q.enQueue(temp);
            tim++;
            }
        else{
            q.deQueue();
            tim++;
            j++;
        }
    }
    System.out.println(tim);
}
}  
