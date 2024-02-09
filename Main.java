import GBLinkedList.Linklist;

public class Main {
    public static void main(String[] args) {

        Linklist<Integer> ll = new Linklist<>();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(15);

        ll.remove(1);

        System.out.println(ll.getValue(0));
        ll.size();

        ll.getAll();
    }

}
