package dev.arraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record packingList(String bagpack, String money, String documents){
    public packingList(String bagpack){
        this(bagpack, "2000 Euro",  "Passport"  );
    }

}
public class ArrayListDemo {
    public static void main(String[] args) {
        // This is wrong implementation of Array List
//        Object[] packingArray = new Object[4];
//        packingArray[0] = new packingList("GOT Bag");
//        packingArray[1] = new packingList("Sky Bag", "3000 Euro", "Train and Flight Ticket");
//        packingArray[2] = "C&A";
//        System.out.println(Arrays.toString(packingArray));
//        ArrayList onjectlist = new ArrayList();
//        onjectlist.add(new packingList("NATIONAL GEO"));
//        onjectlist.add("Visa");

       // ArrayList<packingList> newpacking = new ArrayList<packingList>();
        ArrayList<packingList> newpacking = new ArrayList<>();
        newpacking.add(new packingList("NATIONAL GEO"));
        newpacking.add(new packingList("XEeon", "2000$", "Museum ticket"));
        System.out.println(newpacking.toString());
        newpacking.add(0, new packingList("Grapes"));
        System.out.println(newpacking.toString());
        newpacking.set(0, new packingList(""));


        //Array from ArrayList
        ArrayList<String> data = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
        String[] datarry = data.toArray(new String[0]);
        System.out.println(Arrays.toString(datarry));







    }
}
