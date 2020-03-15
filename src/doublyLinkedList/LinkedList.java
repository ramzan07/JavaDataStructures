package doublyLinkedList;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	int length;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	/* check if linked list is empty */
	public Boolean isEmpty() {
		return length == 0;
	}
	
	/* get length of linked list */
	public int lenght() {
		return length;
	}

	/* Insert at Start */
	public void insertAtStart(T data) {
		Node<T> node = new Node<T>(data);
		if(isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
		}
		node.setNext(head);
		head = node;
		length++;
	}

	public void InsertAtlast(T data) {
		Node<T> node = new Node<T>(data);
		if(isEmpty()) {
			head = node;
		}else {
			node.setPrevious(tail);
			tail.setNext(node);
		}
		tail = node;
		length++;
	}

	public void InsertAtIndex(int index, T data) {
		/*
		 * if(index == 0) { insertAtStart(data); } else if(index == length) {
		 * InsertAtlast(data); } else if(index > length){
		 * System.out.println("LinkList has less size so Can't insert at this position"
		 * ); }else { Node<T> node = head; for(int i=0; i<index-1 && node != null; i++)
		 * { node = node.getNext(); } if(node !=null) { Node<T> nodeAfter =
		 * node.getNext(); Node<T> newNode = new Node<T>(data); node.setNext(newNode);
		 * newNode.setPrevious(node); newNode.setNext(nodeAfter);
		 * nodeAfter.setPrevious(newNode); } }
		 */
		
		if(index == 0) {
			insertAtStart(data);
			return;
		}else if(index > length){
			System.out.println("LinkList has less size so Can't insert at this position");
			return;
		}else if(index == length) {
			InsertAtlast(data);
		}else {
			Node<T> node = head;
			for(int i=1; (i<index); i++) {
				node = node.getNext();
			}
			
			Node<T> nodeAfter = node.getNext();
			Node<T> newNode = new Node<T>(data);
			node.setNext(newNode);
			newNode.setPrevious(node);
			newNode.setNext(nodeAfter);
			nodeAfter.setPrevious(newNode);
			length++;
		}
	}

	public String toString() {
		String List = "";
			Node<T> node = head;
			while(node !=null) {
				List = List+"->"+ node.getData();
				node = node.getNext();
			}
			return List;
	}
	
	public void deleteFrontNode() {
		Node<T> node = head;
		head = head.getNext();
		head.setPrevious(null);
		node = null; // just to nullify old head (Even ok without this )
	}

	public void deleteAtLast() {
		Node<T> node = tail;
		tail = tail.getPrevious();
		tail.setNext(null);
		node = null;
	}

	public void deleteAtIndex(int index) {

		if(index == 0) {
			deleteFrontNode();
		} else if(index == length) {
			deleteAtLast();
		}else if(index > length){
			System.out.println("This index does not exist");
		} else {
			Node<T> node = head;
			for(int i=0; i<index; i++) {
				node = node.getNext();		
			}
			Node<T> tempNext = node.getNext();
			Node<T> tempPrev = node.getPrevious();
			
			tempNext.setPrevious(tempPrev);
			tempPrev.setNext(tempNext);
			node = null;
		}
	}
	
	public void showForward() {
		Node<T> node = head;
		while(node !=null) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}
	
	public void showBackward() {
		if(tail == null) {
			System.out.println("Empty List");
		}
		Node<T> node = tail;
		while(node !=null) {
			System.out.println(node.getData());
			node = node.getPrevious();
		}
	}
}
