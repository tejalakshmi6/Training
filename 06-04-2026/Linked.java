class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null) {
            head = newNode;
            return;
        }
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtPosition(int pos, int data) {
        if(pos == 0) {
            insertAtStart(data);
            return;
        }
        Node newNode = new Node(30);
        Node temp = head;
        for(int i=0; i<pos; i++) {
            if(temp == null) return;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtStart() {
        if(head == null) return;
        head = head.next;
    }

    public void deleteAtEnd() {
        Node temp = head;
        if(head == null) return;
        if(head.next == null) head = null;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPosition(int pos) {
        if(head == null) return;
        if(pos == 0) head = head.next;
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null || temp.next == null) return;
            temp = temp.next;
        }
        if(temp.next != null) 
            temp.next = temp.next.next;
    }

    public void reverse() {
        
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
}

public class Linked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(10);
        list.insertAtEnd(20);
        list.display();
        list.deleteAtEnd();
        list.display();
        list.deleteAtStart();
        list.display();
        list.insertAtPosition(0, 100);
        list.insertAtEnd(200);
        list.display();
        list.deleteAtPosition(1);
        list.display();
    }
}
