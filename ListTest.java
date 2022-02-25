public class ListTest {
    public static void main(String[] args) {
      
        List<String> nodes = new List<>();
        String first = "First";
        String second = "Second";
        String third = "Third";
        Node<String> node1 =nodes.addFirst(first);
        Node<String> node2 = nodes.addFirst(second);
        Node<String> node3 = nodes.addFirst(third);
        System.out.println(nodes);
        System.out.println("Size: "+nodes.size());
        nodes.remove(node2);
        System.out.println(nodes);
        System.out.println("Size: "+nodes.size());
    }
}