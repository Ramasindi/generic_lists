//************ Total Marks for List class: 10 marks
public class List<T> implements IList<T>{

	private Node<T> head = null;
	private Integer size = 0;
	
	/**
	 * Default constructor
	 */
	public List() {
		head = new Node<T>(null, null);
		size = 0;
	}

	/**
	 * Add an element after a given node in the list
	 * ********** 5 marks ****************************
	 */
	@Override
	public Node<T> addAfter(Node<T> elem, T item) {
		if(elem == null) {
			return null;
		}
		Node<T> newItem = new Node<T>(elem.next, item); 

		elem.next = newItem;
		size++;
		return newItem;
	}

	/**
	 * Add an element to the start of the list
	 */
	public Node<T> addFirst(T item) {
		return addAfter(head, item);
	}
	
	/**
	 * Add an element to the end of the list
	 * 
	 */
	public Node<T> addLast(T item) {
		Node<T> currentNode = head.getNext();
		Node<T> prevNode = head;
		while (currentNode != null) {
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		
		return addAfter(prevNode, item);
	}
	
	/**
	 * Remove a specified node from the list. The removed element is returned
	 * ********** 5 marks ****************************
	 */
	@Override
	public T remove(Node<T> elem) {
		Node<T> elemTobeRemoved = search(elem.getElement());
		Node<T> tempNode = head;
		Node<T> prevNode = null;
		
		if((tempNode.element == elemTobeRemoved && tempNode != null)) {
			head = tempNode.next;
			return null;
		}		

        while (tempNode != null && tempNode.element != elemTobeRemoved) {
			prevNode = tempNode;
            tempNode = tempNode.next;
			System.out.println("Checking "+tempNode+ " against "+elemTobeRemoved);
			if(tempNode == elemTobeRemoved) {
				System.out.println("Removing element: "+elemTobeRemoved);
				prevNode.next = tempNode.next;
				size--;
				return elem.getElement();
			}
        }
		
		return null;
		
	}

	@Override
	public T removeLast() {
		if(head == null || head.next == null) return null;

		Node<T> tempNode = head;
		while(tempNode.next.next != null) {
			tempNode = tempNode.next;
		}

		tempNode.next = null;
		size--;
		return head.element;
	}
	@Override
	public T removeFirst() {
		if(head == null) return null;

		Node<T> tempNode = head;
		head = head.next;
		size--;
		System.out.println(head.element);
		return head.element;
	}

	/**
	 * Returns the node that contains the element that is specified as a parameter
	 */
	@Override
	public Node<T> search(T elem) {
		Node<T> currentNode = head.getNext();
		while (currentNode != null) {
			if (currentNode.getElement().equals(elem)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return null;
	}

	/**
	 * returns the first element in the list.
	 * 
	 */
	public Node<T> first() {
		return head.getNext();
	}
	
	/**
	 * Returns true if the list is empty
	 */
	@Override
	public boolean isEmpty() {
		return (head.getNext() == null);
	}

	/**
	 * Return the size of the list
	 */
	@Override
	public Integer size() {
		return size;
	}

	@Override
	public String toString() {
		String result = head.toString() + " <-> ";
		Node<T> currentNode = head.getNext();
		
		while (currentNode.getNext() != null) {
			result += currentNode.toString() + " <-> ";
			currentNode = currentNode.getNext();
		}
		
		result += currentNode.toString();
		
		return result;
	}	
}
