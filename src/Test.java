import java.util.LinkedList;

public class Test {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("a"); //[a]
        ll.add(0, "b"); //[b,a]
        System.out.println(ll.get(0) + "," + ll.get(1)); //should print: "b,a"
        System.out.println("size: " + ll.size()); //should print: "size: 2"
        ll.remove(1); //[b]
        ll.set(0, "c"); //[c]
        System.out.println(ll.get(0)); //should print: "c"
    }

}
