/*Finds the Minimum Element from Doubly Linked list*/

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

    public int findMin() {
        if (head == null) {
            return 0;
        }
        int min = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data < min) {
                min = current.data;
            }
            current = current.next;
        }
        return min; 
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

public class DLL_Minimum {
    public static void main(String[] args) {
        List l = new List();
         System.out.println("Insert at last");
        l.insertlast(120);
        l.insertlast(10);
        l.insertlast(50);
        l.insertlast(40);
        l.insertlast(122);
        l.display();
        if(l.findMin()==0){
            System.out.println("Cannot find min in an empty list");
        }
        else{
        System.out.println("The min element: " + l.findMin());
    }
    }
}
