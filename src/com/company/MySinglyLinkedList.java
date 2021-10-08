package com.company;

public class MySinglyLinkedList implements MyList {
    Node first;
    Node last;
    int size;

    public void add(Integer obj) {
        Node node = new Node(obj);
        if (first == null) {
            first = node;
            last = node;
            size++;
        }
        last.next = node;
        last = node;
        size++;

    }

    public Integer get(int index) {
        try {
            Node current = first;
            int i = 0;
            if (index == 0) {
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
        for (int i = 0; i < size - 1; i++) {
            result.append(current.value);
            if (i < size - 2) {
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

     class Node {
        Integer value;
        Node next;


        public Node(Integer value) {
            this.value = value;
        }
    }


}
