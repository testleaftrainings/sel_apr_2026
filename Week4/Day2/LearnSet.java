package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {
        //Declare a Set
        //Set<String> mentorsName=new HashSet<String>();
        //    0       1        2       3
        // [Vinoth, Harrish, Muthu, Anburaj]

        //Tree Set
        //Set<String> mentorsName=new TreeSet<String>();
        //System.out.println("Set is :"+mentorsName);
       //  0        1        2      4
        //[Anburaj, Harrish, Muthu, Vinoth]

        //LinkedHashSet
        Set<String> mentorsName=new LinkedHashSet<String>();
        System.out.println("Set is :"+mentorsName);
         //  0        1       2        3 
       //[Harrish, Vinoth, Anburaj, Muthu]
        
       //add()
        mentorsName.add("Harrish");
        mentorsName.add("Vinoth");
        mentorsName.add("Anburaj");
        mentorsName.add("Muthu");
       System.out.println("Set is :"+mentorsName);

       //To retrive an element
      
      //Declare an Empty List
       List<String> trainers=new ArrayList<String>(mentorsName);
       System.out.println("List is :"+trainers);

       //Declare Int List/Set
       Set<Character> setName=new HashSet<Character>();
       setName.add('v');

       }

}
