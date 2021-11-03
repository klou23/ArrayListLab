/** Node Class by Trent
 *  Used for ArrayList project Using Nodes
 *  Collaborators: Trent Blair, Kevin Lou, Lily Zook
 */
public class Node<T>{//using type T syntax

    private Node<T> child;
    private Node<T> parent;

    private T value;

    public Node(){}

    public Node(T value){
        this.value = value;
    }

    public Node(T value, Node<T> child, Node<T> parent){//constructor with value node1 and node2
        this.child = child;
        this.parent = parent;
        this.value = value;
    }

    public Node<T> getChild() {
        return child;
    }

    public void setChild(Node<T> child) {
        this.child = child;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T remove(int i){
        if(i > 0){
            if(child == null) throw new IndexOutOfBoundsException();
            return child.remove(i-1);
        }
        T returnVal = value;
        parent.setChild(child);
        child.setParent(parent);
        return returnVal;
    }

    public T get(int i){
        if(i > 0){
            if(child == null) throw new IndexOutOfBoundsException();
            return child.get(i-1);
        }
        return value;
    }

    public T set(int i, T data) {
        if (i > 0) {
            if (child == null) throw new IndexOutOfBoundsException();
            return child.set(i, data);
        }
        T returnVal = value;
        setValue(data);
        return returnVal;
    }

    public String toString(){//to string method
        if (value == null) return "";
        else return "Node: "+ value.toString();
    }

    public boolean equals(Node<T> node){
        if (this.value == null && node.value == null){
            return true;
        } else if (this.value == null || node.value == null){
            return false;
        } else return this.value == node.value;
    }
}

