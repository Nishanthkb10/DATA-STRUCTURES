/*Finds Maximum Element from Doubly Linked List*/

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

    public int findMax() {
        if (head == null) {
            return 0;
        }
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max) {
                max = current.data;
            }
            current = current.next;
        }
        return max; 
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

public class DLL_Maximum {
    public static void main(String[] args) {
        List l = new List();
         System.out.println("Insert at last");
        l.insertlast(120);
        l.insertlast(10);
        l.insertlast(50);
        l.insertlast(40);
        l.insertlast(122);
        l.display();
        if(l.findMax()==0){
            System.out.println("Cannot find max in an empty list");
        }
        else{
        System.out.println("The max element: " + l.findMax());
    }
    }
}
