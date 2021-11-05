public class LinkedList<T> {

    Node<T> head;
    int size;

    public LinkedList() {
        head = new Node<T>();
        size = 0;
    }

    public boolean add(T data){
        size++;
        return head.add(data);
    }

    public void add(int i, T data){
        if (i > size+1) throw new IndexOutOfBoundsException();
        size++;
        head.add(i+1, data);

    }

}
