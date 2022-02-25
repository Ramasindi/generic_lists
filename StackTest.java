public class StackTest {
    public static void main(String[] args) {
        Stack<String> nodes = new Stack<>();
        nodes.push("Node1");
        nodes.push("Node2");
        nodes.push("Node3");
        System.out.println(nodes.peek());
        nodes.pop();
        System.out.println(nodes.peek());
    }
}
