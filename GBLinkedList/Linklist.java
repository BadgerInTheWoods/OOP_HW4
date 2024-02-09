package GBLinkedList;

import java.util.Iterator;

public class Linklist<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size = 0;


    public void addFirst(T elem) {
        Node<T> newNode = new Node<>(elem, head, null);
        if (head != null) {
            head.previous = newNode;
        }
        head = newNode;
        this.size++;
    }

    public void addLast(T elem) {
        Node<T> newNode = new Node<>(elem, null, tail);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
        this.size++;
    }

    public boolean isOutOfRange(int index){
        return (index < 0 || index >= size);
    }


    public void remove(int index) {
        if (isOutOfRange(index)) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (index == 0) {
            head = head.next;
            head.previous = null;
        } if(index == size - 1) {
            tail = tail.previous;
            tail.next = null;
        } else {
            Node<T> current = head;
            for (int i = 0; i != index; i++) {
                current = current.next;
            }
            if (current.next != null) {
                (current.next).previous = current.previous;
                assert current.previous != null;
                (current.previous).next = current.next;
                current = null;
            }
        }
        size--;

    }


    public T getValue(int index) {
        if (isOutOfRange(index)) {
            throw new IndexOutOfBoundsException("Index out of range");

        }
        Node<T> current = head;
        for (int i = 0; i != index; i++) {
            current = current.next;
        }
        return current.value;
    }


    public void size() {
        System.out.println("size of an array is " + size);
    }

    public void getAll() {
        System.out.print("values in array are : ");
        for (int i = 0; i < size; i++){
            System.out.print(getValue(i));
            System.out.print(" ");
        }
    }

}
