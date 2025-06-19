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
    
   public void deletefirst() {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (head.next == head) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
        }
    }

    public void deleteposition(int pos) {
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }
        if (pos < 1) {
            System.out.println("Invalid position.");
            return;
        }
        if (pos == 1) {
            deletefirst();
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            if (temp.next == head) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }
        if (temp.next != head) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Position out of bounds.");
        }
    }

    public void deletelast() {
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
    public class CLL_delete{
        public static void main(String[] args){
             List l = new List();
             System.out.print("Initial Insertion: ");
             l.insertlast(10);
             l.insertlast(20);
             l.insertlast(30);
             l.insertlast(40);
             l.insertlast(50);
             l.insertlast(60);
             l.insertlast(70);
             l.display();
             System.out.print("\nDelete at Begin: ");
             l.deletefirst();
             l.display();
             System.out.print("\nDelet at Position: ");
             l.deleteposition(2);
             l.display();
             System.out.print("\nDelete at End: ");
             l.deletelast();
             l.display();
        }
    }
