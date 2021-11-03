public class LinkedList<T> {

    Node<T> head;
    int size;

    public LinkedList() {
        head = new Node<T>();
        size = 0;
    }

    public T set(int i, T data) {
        if(i > size) throw new IndexOutOfBoundsException();
        return head.set(i+1, data);
    }   

    public int size(){
        return size;
    }

}

