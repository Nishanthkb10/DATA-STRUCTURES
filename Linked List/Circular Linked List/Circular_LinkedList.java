import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CLL_List {
    Node head,tail;
    
    public void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = head;
        }
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }
    
   public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data+" ");
            temp = temp.next;
        } while (temp != head);
    }
    
}
    public class Circular_LinkedList{
        public static void main(String[] args){
            CLL_List list=new CLL_List();
            System.out.print("Ciruclar Linked List: ");
            list.insert(10);
            list.insert(20);
            list.insert(30);
            list.insert(40);
            list.insert(50);
            list.display();
            list.delete();
            list.delete();
            System.out.print("\nAfter Deletion: ");
            list.display();
        }
    }
