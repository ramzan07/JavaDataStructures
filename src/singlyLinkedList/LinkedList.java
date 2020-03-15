package singlyLinkedList;
public class LinkedList{
	Node head;
	
	public void insert(int data) {
		
		Node node = new Node(data, null);
		
		if(head == null) {
			head = node;
		} else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}

	public void insertAtFirst(int data) {
		
		Node node = new Node(data, null);

		node.next = head;
		head = node;
	}

	public void insertAtIndex(int index, int data) {
		
		Node node = new Node(data, null);

		if(index  == 0) {
			insertAtFirst(data);
		}else {
		Node n = head;
		for(int i=0; i<index-1; i++) {
			n = n.next;
		}
		
			node.next = n.next;
			n.next = node;
		}
	}

	public void delete(int index) {

		if(index == 0) {
			head = head.next;
		} else {
			Node n = head;
			for(int i=0; i<index-1; i++) {
				n = n.next;
			}
			Node temp = n.next;
			n.next = temp.next;
			temp = null;
			
		}
	}

	public void show() {
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		//System.out.println(n.data);
	}
}