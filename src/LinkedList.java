public class LinkedList<T> {

    Node<T> head;
    int size;

    public LinkedList() {
        head = new Node<T>();
        size = 0;
    }

    public T remove(int i){
        if(i > size) throw new IndexOutOfBoundsException();
        size--;
        return head.remove(i+1);
    }

    public T get(int i){
        if(i > size) throw new IndexOutOfBoundsException();
        return head.get(i+1);
    }
}
