public class LinkedList {

	public class Node {
		int data;
		Node next;

		public Node(int n) {
			this.data = n;
			this.next = null;
		}
	}
	Node head;


	public LinkedList() {
		this.head = null;
	}

	public void add(int n ) {
		if (this.head == null) {
			Node newNode = new Node(n);
			this.head = newNode;
			return;
		}

		Node temp = this.head;

		while(temp != null && temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(n);
		return;
	}

	public void printList() {
		if (this.head == null) {
			System.out.println("Empty list");
		}

		Node head = this.head;
		while(head != null) {
			System.out.print(head.data);
			System.out.print("->");
			head = head.next;
		}


	}


}