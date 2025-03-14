class LL {
    private int size;
    Node head;

    public LL() {
    	size = 0;
    }

    void insertFirst(int data) {
    	Node node = new Node(data);
	node.next = head;
	head = node;
    }

    void insertLast(int data) {
	if (head == null) {
	    System.out.println("Cannot insert, list is empty!");
	    return;
	}
	Node node = new Node(data);
    	Node temp = head;
	while (temp.next != null) {
	    temp = temp.next;
	} 
	temp.next = node;
    }

    void insert(int data, int index) {
    	if (head == null) {
            System.out.println("Cannot insert, list is empty!");
            return;
        }
	Node node = new Node(data);
        Node temp = head;
	for (int i=0; i<index; i++) {
	    temp = temp.next;
	}
	node.next = temp.next;
	temp.next = node;
    }

    void display() {
	Node temp = head;
    	while (temp != null) {
	    System.out.print(temp.data + " -> ");
	    temp = temp.next;
	}
	System.out.println("End");
    }

    private class Node {
	int data;
	Node next;

        public Node(int data) {
	    this.data = data;	
	}

	public Node(int data, Node next) {
	    this.data = data;
	    this.next = next;
	}
    }
}

public class Main {
    public static void main(String[] args) {
    	LL list = new LL();
	list.insertFirst(4);
	list.insertFirst(3);
	list.insertLast(5);
	list.insertLast(6);
	list.insert(7, 2);
	list.display();
    }
}
