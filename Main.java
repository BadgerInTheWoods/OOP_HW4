import GBLinkedList.Linklist;

public class Main {
    public static void main(String[] args) {

        Linklist<Integer> ll = new Linklist<>();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(15);
        ll.addLast(17);
        ll.addLast(154);
        ll.addFirst(125);

        ll.remove(1);

        System.out.println(ll.getValue(4));
        ll.size();

        ll.getAll();
    }

}
