public class Node {
    private int a;
    private Node next = null;
    public Node (int a1){
        a = a1;
    }
    public void addNode (Node node1){
        next= node1;
    }

    public int getA() {
        return a;
    }

    public Node getNext() {
        return this.next;
    }
}
