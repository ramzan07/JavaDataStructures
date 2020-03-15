package singlyLinkedList;

public class Runner{
	public static void main(String[] arg) {
		
		LinkedList list = new LinkedList();
		
		list.insert(10);
		list.insert(12);
		list.insert(15);
		list.insert(18);
		//list.insertAtFirst(2);
		//list.insertAtIndex(1, 7);
		//list.delete(3);

		list.show();
	}
}
