
public interface IList<T> {
	public Node<T> addAfter(Node<T> elem, T item);
	public Node<T> addFirst(T item);
	public Node<T> addLast(T item);
	public T remove(Node<T> elem);
	public Node<T> search(T elem);
	public Node<T> first();
	
	
	public boolean isEmpty();
	public Integer size();
}
