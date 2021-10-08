package com.company;

public class MyDoublyLinkedList implements MyList {
    Node first = null;
    Node last = null;
    int size;

    public void add(Integer obj) {
        Node node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            first.next = null;
            last.next = null;
        } else {
            last.next = node;
            node.prev = last;
            last = node;
        }
        size++;
    }

    public Integer get(int index) {
        try {
            Node current = first;
            int i = 0;
            if (index == 0) {
                System.out.println("The first value of MyDoublyLinkedList is");
                return first.value;
            } else
                do {
                    current = current.next;
                    i++;
                }
                while (i < index);
            System.out.println("Return value by index " + i + " is");
            return current.value;

        } catch (NullPointerException ex) {
            System.out.println("There is no such Node by this index");
            return -1;
        }

    }

    public boolean remove(Integer obj) {
        Node current = first;
        if (first.value == obj) {
            first = first.next;
            size--;
            return true;
        }
        while (current.next != null) {
            if (current.next.value == obj) {
                if (current.next != last) {
                    current.next = current.next.next;
                } else {
                    current.next = null;

                }
                size--;
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public void remove(int index) {
        Integer value = get(index);
        remove(value);
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            result.append(current.value);
            if (current.next != null) {
                result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }

    public boolean contains(Integer obj) {
        Node current = first;
        for (int i = 0; i < size(); i++) {
            if (current == null) {
                return false;
            } else if (current.value == obj) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    static class Node {
        Integer value;
        Node next;
        Node prev;


        public Node(Integer value) {
            this.value = value;
        }
    }

}
