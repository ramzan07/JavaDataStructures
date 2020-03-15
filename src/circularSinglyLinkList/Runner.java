package circularSinglyLinkList;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.createData();
		
		list.InsertAtStart(11);
		list.insertAtEnd(22);
		list.insertAtEnd(33);
		list.InsertAtStart(10);
		 

		list.InsertAtIndex(2, 55);
		
		list.removeFirst();
		//list.removeLast();
		list.deleteAt(2);

		list.display();
	}
}
