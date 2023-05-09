// package day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;;



public class CollectionsDemo {
    public static void main(String[] args) {
        // ArrayList <String> list1= new ArrayList<>();

        // list1.add("BKK");
        // list1.add("BLR");
        // list1.add("MPL");
        // list1.add(3, "TPT");
        // list1.set(0, "CMY");

        // Iterator <String> cities = list1.iterator();

        // while(cities.hasNext()){
        //     System.out.println(cities.next());
        // }



        Vector <Integer> vector1 = new Vector<Integer>();
        vector1.add(1);
        vector1.add(12);
        vector1.add(14);
        vector1.add(0);
        vector1.add(5);
        System.out.println(vector1);
        Collections.sort(vector1);
        System.out.println(vector1);


    }
}
