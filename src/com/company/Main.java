package com.company;

public class Main {

    public static void main(String[] args) {
        //--------------     MySinglyLinkedList      --------------
        //-------------- Adding elements to singlyLinkedList-------
        MySinglyLinkedList mySinglyLinkedList = new MySinglyLinkedList();

        mySinglyLinkedList.add(67);
        mySinglyLinkedList.add(6);
        System.out.println(mySinglyLinkedList);
        System.out.println(mySinglyLinkedList.get(3));

        mySinglyLinkedList.add(7);
        mySinglyLinkedList.add(78);
        mySinglyLinkedList.add(68);
        System.out.println(mySinglyLinkedList.contains(78));
        System.out.println(mySinglyLinkedList);
        System.out.println(mySinglyLinkedList.get(4));

        mySinglyLinkedList.add(78);
        System.out.println(mySinglyLinkedList);

        mySinglyLinkedList.remove((Integer) 78);
        mySinglyLinkedList.remove((Integer) 7);
        mySinglyLinkedList.remove(3);
        mySinglyLinkedList.remove((Integer) 67);
        mySinglyLinkedList.remove((Integer) 14);
        System.out.println(mySinglyLinkedList);
        System.out.println(mySinglyLinkedList.contains(565));


        //--------------     MyDoublyLinkedList      --------------
        //-------------- Adding elements to doublyLinkedList-------
        MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();
        myDoublyLinkedList.add(5);
        myDoublyLinkedList.add(6);
        myDoublyLinkedList.add(7);
        myDoublyLinkedList.add(8);
        System.out.println(myDoublyLinkedList);
        //-----------------
        System.out.println(myDoublyLinkedList.contains(5));
        System.out.println(myDoublyLinkedList.contains(55));
        System.out.println(myDoublyLinkedList.get(2));
        System.out.println(myDoublyLinkedList.get(0));

        // ------------ Removing element from doublyLinkedList   -------
        myDoublyLinkedList.remove((Integer) 5);
        myDoublyLinkedList.remove((Integer) 8);
        //  myDoublyLinkedList.remove((Integer)7);
        //  myDoublyLinkedList.remove((Integer)6);
        System.out.println(myDoublyLinkedList);

    }
}
