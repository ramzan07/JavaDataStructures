package circularSinglyLinkList;

public class LinkedList {
	Node last;
	int length;
	
	LinkedList(){
		this.last = null;
		this.length = 0;
	}

	public int length() {
		return length;
	}
	
	public Boolean isEmpty() {
		return length == 0;
	}

	public void createData() {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node1;
		
		last = node4;
		}

	public void InsertAtStart(int data) {
		Node node = new Node(data);
		if(last == null) {
			last = node;
		}else {
			node.next = last.next;
		}
		last.next = node;
		length++;
	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);

		/*
		 * Node temp = last.next; last.next = node; node.next = temp; last = node;
		 */
		if(last == null) {
			last = node;
			last.next = last;
		} else {
			node.next = last.next;
			last.next = node;
			last = node;
		}
		length++;
	}

	public void InsertAtIndex(int index, int data) {
		if(index == 0) {
			InsertAtStart(data);
		} if(index == length) {
			insertAtEnd(data);
		} else {
			Node node = new Node(data);
			Node first = last.next;
			for(int i=0; i<index-1; i++) {
				first = first.next;
			}
			node.next = first.next;
			first.next = node;
			length++;
		}
	}

	public void removeFirst() {
		Node first = last.next;
		last.next = first.next;
		first = null;
		length--;
	}

	public void removeLast() {
		Node first = last.next;
		while(first.next != last) {
			first = first.next;
		}
		first.next = last.next;
		last = first;
		length--;
		
	}

	public void deleteAt(int index) {
		if(index == 0) {
			removeFirst();
		} else if(index == length){
			removeLast();
		} else {
			Node first = last.next;
			for(int i=0; i<index-1; i++) {
				first = first.next;
			}
			Node temp = first.next;
			first.next = temp.next;
			temp = null;
			length --;
		}
	}

	public void display() {
		Node firstNode = last.next;
		while(firstNode != last) {
			System.out.println(firstNode.data);
			firstNode = firstNode.next;
		}
		System.out.println(firstNode.data);
	}
}
