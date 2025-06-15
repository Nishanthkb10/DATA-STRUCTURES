/*Sorting the Doubly Linked list in ascending order*/

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

public void sort() {
        if (head == null) return;
        boolean swap = true;
        Node current;
        while (swap) {
            swap = false;
            current = head;
            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            }
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

public class DLL_Sorting {
    public static void main(String[] args) {
        List l = new List();
         System.out.println("Insert at last");
        l.insertlast(120);
        l.insertlast(10);
        l.insertlast(50);
        l.insertlast(40);
        l.insertlast(122);
        l.display();
        l.sort();
        System.out.println("After Sorting: ");
        l.display();
    }
}
