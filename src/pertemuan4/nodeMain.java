package pertemuan4;

public class nodeMain {
    public void display(node current) {
        while (current != null) {
            System.out.print(" " + current.getValue());
            current = current.getNode();
        }
    }

    public static void main(String[] args) {
        node node1 = new node(1);
        node node2 = new node(2);
        node node3 = new node(3);
        node node4 = new node(4);
        node node5 = new node(5);

        node1.setNode(node2);
        node2.setNode(node3);
        node3.setNode(node4);
        node4.setNode(node5);

        node current = node1;

        nodeMain nm = new nodeMain();
        nm.display(current);
    }
}
