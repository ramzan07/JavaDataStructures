package circularDoublyLinkedList;

public class Runner {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
		list.InsertAtEnd(5);
		list.InsertAtEnd(10);
		list.InsertAtEnd(11);
		
		list.InsertAtStart(786);
		
		list.insertAtIndex(1, 55);
		list.deletAt(2);
		list.display();
	}

}
