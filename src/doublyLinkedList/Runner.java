package doublyLinkedList;

public class Runner {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList();
		/*
		 * list.insertAtStart(1); list.insertAtStart(2);
		 * 
		 * list.InsertAtlast(3);
		 */
		//list.InsertAtlast(10);
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.insertAtStart(1);
		list.InsertAtIndex(1, 2);
		/*
		 * list.InsertAtIndex(0, 1); list.InsertAtIndex(1, 2); list.InsertAtIndex(2, 3);
		 * list.InsertAtIndex(3, 4); list.InsertAtIndex(4, 5);
		 */


		//list.deleteFrontNode();
		//list.deleteAtLast();

		//list.deleteAtIndex(5);
		System.out.println("Forward List"); list.showForward();
		//System.out.println("Backward List"); list.showBackward();
		 
		
		//System.out.println(list.toString());
	}
}
