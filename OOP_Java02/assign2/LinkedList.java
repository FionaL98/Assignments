package assignment2;

public class LinkedList {
    private Node head = null;
    private int size = 0;

    public void addCustomer(Customer customer){

        //if list is empty and this is the first customer being inserted
        if (this.head == null){
            Node newNodeInserted = new Node(customer, this.head);
            this.head = newNodeInserted;
            size++;
            return;

        //if the list is NOT empty
        } else {

            Node newNodeInserted = new Node(customer, null);

            //if the newNodeInserted comes before the head alphabetically
            if (newNodeInserted.getCustomer().isAlphabeticallyBefore(head.getCustomer())){
                Node newHeadNode = new Node(newNodeInserted.getCustomer(), head);
                head = newHeadNode;
                size++;
                return;

            //finding the placement for the newNodeInserted
            } else {
                Node currentNode = this.head;

                //if it comes alphabetically before the currentNode, it will be inserted before that
                while (currentNode.getNextNode() != null){
                    if (newNodeInserted.getCustomer().isAlphabeticallyBefore(currentNode.getNextNode().getCustomer())){
                        Node tempNode = new Node(newNodeInserted.getCustomer(), currentNode.getNextNode());
                        currentNode.setNextNode(tempNode);
                        size++;
                        return;
                    }
                    currentNode = currentNode.getNextNode();
                }
            
                //if none, then it will go to the bottom of the list
                Node tempNode = new Node(newNodeInserted.getCustomer(), null);
                currentNode.setNextNode(tempNode);
                size++;
                return;
            }

        }    
       
    }

    //printing out all the names in the list
    public String toString(){
        String customerNames = "Customer Names: \n";
        Node shuttle = this.head;
        while(shuttle != null){
            customerNames += "\t"+ shuttle.getCustomer().getName() + "\n";
            shuttle = shuttle.getNextNode();
        }
        return customerNames;
    }    

    //printing out all the names that match the int passed birthmonth
    public void printBirthdayCardsForSpecifiedMonth(int birthMonth){
        String birthdayMessage ="Birthday Months: \n";
        Node shuttle = this.head;
        while(shuttle != null){
            if(shuttle.getCustomer().getBirthdayMonth() == birthMonth){
                birthdayMessage += "Happy Birthday " + shuttle.getCustomer().getName() +"\n";
                birthdayMessage += "Please accept our coupon for $10 off of your next purchase of more than \n";
                birthdayMessage += "$100,000 \n\n";
            }
            shuttle = shuttle.getNextNode();
        }
        System.out.println(birthdayMessage);
    }

    //printing in reverse without touching the actual list
    public void reverse(){
        
        Node currentNode = head;
        Node lastNode = null;

        while (lastNode != head){

            //travels all the way to the "last node" 
            //so the one before the last
            while (currentNode.getNextNode() != lastNode) {
                currentNode = currentNode.getNextNode();
            }

            //stores as new last 
            lastNode = currentNode;
            System.out.println(lastNode.getCustomer().getName());

            currentNode = head;
        }
    }


    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }


}
