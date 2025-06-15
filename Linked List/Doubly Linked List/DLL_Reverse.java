/*Reverse the Given Doubly Linked List*/

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class List {
    Node head, tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    public void insertlast(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
    }

    public void reverse() {
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }
    
    
    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class DLL_Reverse {
    public static void main(String[] args) {
        List l = new List();
         System.out.println("Insert at last");
        l.insertlast(10);
        l.insertlast(20);
        l.insertlast(30);
        l.insertlast(40);
        l.insertlast(50);
        l.display();
        System.out.println("Reverse of list");
        l.reverse();
        l.display();
    }
}
