package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Array
        String[] names = new String[5];
        names[0] = "Prime";
        names[1] = "Naz";
        names[2] = "Dee";
        names[3] = "Ellie";
        names[4] = "Derek";

//        System.out.println(Arrays.toString(names));

//        System.out.println(names[2]);

        //Array BigO
        //Accessing bigO is O(1)
        //Searching bigO is O(n)
        //Inserting bigO is O(n)
        //Deleting bigO is O(n)


        //ArrayList
        ArrayList<String> cities = new ArrayList<String>();

        //Add Data of ArrayList
        cities.add("New York City");
        cities.add("Brussels");
        cities.add(2, "london");
        cities.add(3, "Jakarta");
        cities.add("Tokyo");
        cities.add("Abu Dhabi");

        //Delete Data of ArrayList
        cities.remove("london");
        cities.remove(3);

        //Get Data of ArrayList
        cities.get(0);
//        System.out.println(cities.get(3));

        //Set Data of ArrayList
        cities.set(0, "Singapore");

        //Clear Data of ArrayList
        cities.clear();

        //Convert To Array
        cities.toArray();
//        System.out.println(Arrays.toString(cities.toArray()));

        //ArrayList BigO
        //Accessing bigO is O(1)
        //Searching bigO is O(n)
        //Inserting bigO is O(n)
        //Deleting bigO is O(n)

        //Stack
        //LIFO Last In First Out
        Stack<String> books = new Stack<String>();

        //Add Data to Stack
        books.push("Atomic Habit");
        books.push("Deep Work");
        books.push("Clean Code");
        books.push("Love Verse");
        books.push("The Maus");

        //Delete data from Stack
        books.pop();
        books.pop();

        //Get Data from Stack
        books.peek();
//        System.out.println(books.peek());

        //Check element of stack if exist
        books.contains("Love Verse");
//        System.out.println(books.contains("Love Verse"));

        //Stack BigO
        //Accessing bigO is O(n)
        //Searching bigO is O(n)
        //Inserting bigO is O(1)
        //Deleting bigO is O(1)

        //Queue
        //FIFO First In First Out

        Queue<String> passengers = new LinkedList<String>();

        //Add data to Queue
        passengers.add("Michael");
        passengers.add("Jones");
        passengers.add("Emily");
        passengers.add("Ryan");
        passengers.add("Craig");

        //Remove data from Queue
        passengers.remove();
        passengers.remove();

        //Get data from Queue
        passengers.peek();
//        System.out.println(passengers.peek());

        //Check element of stack if exist
        passengers.contains("Craig");
//        System.out.println(passengers.contains("Craig"));

        //Queue BigO
        //Accessing bigO is O(n)
        //Searching bigO is O(n)
        //Inserting bigO is O(1)
        //Deleting bigO is O(1)



        //LinkedList
        LinkedListClass linkedListClass = new LinkedListClass();
        linkedListClass.insert(5);
        linkedListClass.insert(3);
        linkedListClass.insert(7);
        linkedListClass.insert(4);
        linkedListClass.insert(9);

        //LinkedList BigO
        //Accessing bigO is O(n)
        //Searching bigO is O(n)
        //Inserting bigO is O(n) | O(1)
        //Deleting bigO is O(n) | O(1)


        //DoublyLinkedList
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(1);
        doublyLinkedList.insert(7);
        doublyLinkedList.insert(3);
        doublyLinkedList.insert(9);
//        doublyLinkedList.insertAtStart(0);
//        doublyLinkedList.insertAt(0, 100);
//        doublyLinkedList.delete();
//        doublyLinkedList.deleteAtStart();
        doublyLinkedList.show();

    }
}
