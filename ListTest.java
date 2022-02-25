public class ListTest {
    public static void main(String[] args) {
      
        List<String> nodes = new List<>();
        String first = "First";
        String second = "Second";
        String third = "Third";
        String forth = "Forth";
        Node<String> node1 =nodes.addFirst(first);
        Node<String> node2 = nodes.addFirst(second);
        Node<String> node3 = nodes.addFirst(third);
        Node<String> node4 = nodes.addFirst(forth);
        System.out.println(nodes);
        System.out.println("Size: "+nodes.size());
        System.out.println("----------------------------------");
        nodes.remove(node2);
        System.out.println(nodes);
        System.out.println("Size: "+nodes.size());
        System.out.println("----------------------------------");
        nodes.removeLast();
        System.out.println(nodes);
        System.out.println("Size: "+nodes.size());
        System.out.println("----------------------------------");
        nodes.removeFirst();
        System.out.println(nodes);
        System.out.println("Size: "+nodes.size());
    }
}