package assignment2;

public class Node {
    private Customer node;
    private Node nextNode;

    public Node(Customer node, Node nextNode){
        this.node = node;
        this.nextNode = nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

    public Node getNextNode(){
        return nextNode;
    }   

    public Customer getCustomer(){
        return this.node;
    }

}
