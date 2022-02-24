//************ Total Marks for Stack class: 5 marks
public class Stack<T> {
	private IList<T> stack;
	
	/*
	 * Default constructor
	 */
	public Stack() {
		stack = new List<T>();
	}
	
	/*
	 * The push method that inserts an element
	 * ********** 2 marks ****************************
	 */
	public void push(T item) {
		//COMPLETE CODE HERE
	}
	
	/*
	 * The pop method that removes an element
	 * ********** 3 marks ****************************
	 */
	public T pop() {
		//COMPLETE CODE HERE
	}
	
	/*
	 * The peak method that returns the top element
	 */
	public T peek() {
		Node<T> elem = stack.first();
		return elem.getElement();
	}
	
	/*
	 * Returns if the stack is empty
	 */
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	/*
	 * Returns amount of elements in the stack
	 */
	public Integer size() {
		return stack.size();
	}
	
}
