class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    Node head;

    public List() {
        this.head = null;
    }

    public void insertlast(int data) {
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
    
    public void insertfirst(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            n.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            n.next = head;
            head = n;
            temp.next = head;
        }
    }

    public void insertposition(int pos, int data) {
        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            insertfirst(data);
            return;
        }
        Node n = new Node(data);
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
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
    public class CLL_insert{
        public static void main(String[] args){
             List l = new List();
             System.out.print("Initial Insertion: ");
             l.insertlast(10);
             l.insertlast(20);
             l.insertlast(30);
             l.insertlast(40);
             l.display();
             System.out.print("\nInsert at Begin ");
             l.insertfirst(7);
             l.insertfirst(5);
             l.display();
             System.out.print("\nInsert at Position ");
             l.insertposition(2,6);
             l.insertposition(7,35);
             l.display();
        }
    }
