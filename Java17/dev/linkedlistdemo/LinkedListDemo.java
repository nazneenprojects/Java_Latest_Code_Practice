package dev.linkedlistdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Swiss");
        placesToVisit.add("Sweden");
        System.out.println(placesToVisit);


        var newPlacesToVisit = new LinkedList<String>();
        newPlacesToVisit.add("Austrelia");
        newPlacesToVisit.add(0, "Germany");
        System.out.println(newPlacesToVisit);

        addMoreElements(newPlacesToVisit);
        System.out.println(newPlacesToVisit);

        removeElements(placesToVisit);
        System.out.println(placesToVisit);

        printIterations(newPlacesToVisit);


    }

    private static void addMoreElements(LinkedList<String> input){

        input.addFirst("US");
        input.addLast("NewZealand");
        input.remove();

        //QUEUE
        input.offer("NA");
        input.offerFirst("China");
        input.offerLast("Turkey");
        input.poll();

        //STACK
        input.push("India");
        input.push("Brazil");
        input.pop();
    }

    public static void removeElements(LinkedList<String> list){
        System.out.println("Retrieved Element :" + list.get(1));
        System.out.println("Retrieved Element :" + list.getFirst());
        System.out.println("Retrieved Element :" + list.getLast());

        System.out.println("Last index of.."+ list.lastIndexOf("Sweden"));

    }

    public static void printIterations(LinkedList<String> input){

        System.out.println("using for loop");
        for(int i =1; i < input.size(); i++)
            System.out.println("----->"+ input.get(i-1)+ " TO  "+input.get(i));

        System.out.println("Trip ends at "+ input.getLast() );

        System.out.println("using for each");
        for(String town : input){
            System.out.println("List of towns in >"+  town);

        }

        System.out.println("using iterator");
        ListIterator<String> itr  = input.listIterator();
        while(itr.hasNext()){
            var town = itr.next();
            System.out.println("iterated country:  "+town);
        }

    }

}
