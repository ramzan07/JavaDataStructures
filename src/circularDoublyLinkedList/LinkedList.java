package circularDoublyLinkedList;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	int length;

	public void InsertAtEnd(T data) {
		Node<T> node = new Node<T>(data);

		if(head == null) {
			node.setNext(node.getPrevious());
			node.setPrevious(node);
			head = node;
			tail = node;
		} else {
			//Node last = tail;
			  
		    // Create Node dynamically
		    Node<T> new_node = new Node<T>(data);    
		  
		    // Start is going to be next of new_node  
		    new_node.setNext(head);
		  
		    // Make new node previous of start  
		    head.setPrevious(new_node);
		  
		    // Make last preivous of new node  
		    new_node.setPrevious(tail);  
		  
		    // Make new node next of old last  
		    tail.setNext(new_node);
		    tail = new_node;
		}
		length++;
	}

	public void InsertAtStart(T data) {
		Node<T> new_node = new Node<T>(data);
		if(length == 0) {
			new_node.setNext(new_node.getPrevious());
			new_node.setPrevious(new_node);
			head = new_node;
			tail = new_node;
		} else {
			new_node.setNext(head);
			head.setPrevious(new_node);
			
			head = new_node;
	
			head.setPrevious(tail);
			tail.setNext(head);
		}
		length++;
	}
	
	public void insertAtIndex(int index, T data) {
		if(index == 0) {
			InsertAtStart(data);
		} else {
			Node<T> new_node = new Node<T>(data);
			Node<T> start = head;
			for(int i = 1; i < index; i++) {
				start = start.getNext();
			}
			Node<T> after = start.getNext();
			
			new_node.setNext(after);
			after.setPrevious(new_node);
			
			start.setNext(new_node);
			new_node.setPrevious(start);
			
		}
	}
	
	public void deletAt(int index) {
		if(index == 0 || index == length || index > length) {
			System.out.println("...Todo");
		} else {
			Node<T> start =  head;
			for(int i=1; i<index; i++) {
				start = start.getNext();
			}
			
			Node<T> target = start.getNext();
			Node<T> nextAfter = target.getNext();
			start.setNext(nextAfter);
			nextAfter.setPrevious(start);
			target = null;
		}
	}

	public void display() {
		
		  Node<T> first = head;
		  System.out.println("Forward");
		  while(first != tail) 
		  {
			  System.out.println(first.getData());
			  first = first.getNext(); 
		  }
		  System.out.println(first.getData());

		  System.out.println("Backward");
		  
		  Node<T> last = tail;
		  while(last != head) {
			  System.out.println(last.getData());
			  last = last.getPrevious();
		  }
		  System.out.println(last.getData());
		 
	
		
	}
}
