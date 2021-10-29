public class LinkedList<T> {

    Node<T> head;
    int size;

    public LinkedList() {
        head = new Node<T>();
        size = 0;
    }

    public T remove(int i){
        if(i > size) return null;
        size--;
        return head.remove(i+1);
    }
}
