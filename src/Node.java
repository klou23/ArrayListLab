public class Node<T>{//using type T syntax

    private Node nodeOne;
    private Node nodeTwo;

    private T value;

    public Node(){//default constructor
        nodeOne = null;
        nodeTwo = null;
    }

    public Node(T value){
        nodeOne = null;
        nodeTwo = null;
        this.value = value;
    }

    public Node(T value, Node node1, Node node2){//constructor with value node1 and node2
        this.nodeOne = node1.nodeOne;
        this.nodeTwo = node2.nodeTwo;
        this.value = value;
    }


    //Mutators

    public void setValue(T value){
        this.value = value;
    }

    public void setFirstNode(Node nodeOne){// sets the first node
        this.nodeOne = nodeOne;
        makeChild(nodeOne);
    }

    public void setSecondNode(Node nodeTwo) {// sets the second node
        this.nodeTwo = nodeTwo;
        makeParent(nodeTwo);
    }

    private void makeChild(Node nodeOne){//child node
        this.nodeOne = nodeOne;
    }

    private void makeParent(Node nodeTwo){//parent node
        this.nodeTwo = nodeTwo;
    }

    //accessors

    public T getValue(){
        return value;
    }

    public Node getFirstNode(){//gets the first node
        return nodeOne;
    }

    public Node getSecondNode(){//gets the second node
        return nodeTwo;
    }

    public String toString(){//to string method
        if (value == null) return "";
        else return "Node: "+ value.toString();
    }

    public boolean equals(Node node){
        if (this.value == null && node.value == null){
            return true;
        } else if (this.value == null || node.value == null){
            return false;
        } else return this.value == node.value;
    }
}

