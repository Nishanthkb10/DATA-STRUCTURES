/*This Ball Passing Game is an implementation of Stack concepts that gets user inputs and perform 
Forwarding and Backwarding operation and computes the result 
with whom have the ball with them at last.
*/

/* Sample Input:
5 7
F 8
F 9
F 10
R
R
*/

/* Sample Output : Player 8 */

import java.util.Scanner;
import java.util.Stack;

public class BallPassingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int currentPlayerId = sc.nextInt();
        Stack<Integer> playerStack = new Stack<>();
        playerStack.push(currentPlayerId);
        for (int i = 0; i < N; i++) {
            String command = sc.next();
            if (command.equals("F")) {
                int newPlayerId = sc.nextInt();
                playerStack.push(newPlayerId);
            } else if (command.equals("R")) {
                if (playerStack.size() > 1) {
                    playerStack.pop();
                }
            }
        }
        System.out.println("Player " + playerStack.peek());
        sc.close();
    }
}

