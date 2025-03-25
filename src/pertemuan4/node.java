package pertemuan4;

public class node {
    private int value;
    private node node;

    public node(int value) {
        this.value = value;
    }

    public node getNode() {
        return node;
    }

    public void setNode(node node) {
        this.node = node;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
