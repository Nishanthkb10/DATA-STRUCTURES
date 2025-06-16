/*This Ball Passing Game is an implementation of Stack concepts that gets user inputs and perform 
Forwarding and Backwarding operation and computes the result 
with whom have the ball with them at last.
*/

/* Sample Input:
10 23
F 86
F 63
F 60
R
F 47
R
F 99
F 9
R
R
*/

/* Sample Output : Player 9 */

import java.util.*;

class BallPassingGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=sc.nextInt();
        Stack<Integer>s=new Stack<>();
        s.push(val);
        for(int i=0;i<n;i++){
            String command=sc.next();
            if(command.equals("F")){
                int ans=sc.nextInt();
                s.push(ans);
            }
            else if(command.equals("R")){
                if(s.size()>=2){
                    int top=s.pop();
                    int secondtop=s.pop();
                    s.push(top);
                    s.push(secondtop);
                }
            }
        }
        if(s.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        else{
            System.out.println("Player "+s.peek());
        }
    }
}
