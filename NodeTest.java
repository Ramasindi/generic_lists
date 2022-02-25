/**
 * NodeTest
 */
public class NodeTest {

    public static void main(String[] args) {
        Node<String> third = new Node<String>(null, "ThirdNode"); 
        Node<String> second = new Node<String>(third, "SecondNode"); 
        Node<String> first = new Node<String>(second, "FirstNode");

        System.out.println(first);
        System.out.println(first.getNext());
        System.out.println(second.getNext());
    }
}