package org.testleaf.week4.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

    public static void main(String args[]){
    
        //Declare a List
    List<String> learnersName=new ArrayList<String>();
    System.out.println("The List is: "+learnersName);

    //adding an element - add()
    learnersName.add("Rajesh");
    System.out.println("The List is: "+learnersName);

    //add more element
    learnersName.add("Bharath");
    System.out.println("The List is: "+learnersName);

    learnersName.add("Arun");
    learnersName.add("Vinoth");
    System.out.println("The List is: "+learnersName);
//       0        1      2       3
    //[Rajesh, Bharath, Arun, Vinoth]

    //to count the number of elements - size()
    int sizeOfList = learnersName.size();
    System.out.println("sizeOfList: "+sizeOfList);

    //To retrieve a particular element -  get()
   String stringAtIndex1 = learnersName.get(1);
   System.out.println("stringAtIndex1: "+stringAtIndex1);

   //add duplicates
   learnersName.add("Bharath");
   System.out.println("The List is: "+learnersName);

   //To remove an element
   learnersName.remove(1);
   System.out.println("The List is: "+learnersName);

   //[Rajesh, Arun, Vinoth, Bharath]

   //addAll - to add all the elements from one List to Another List
    List<String> employee=new ArrayList<String>();
    System.out.println("The List is: "+employee);
    employee.addAll(learnersName);
    System.out.println("The List is: "+employee);

    //To remove/clear all the elements - clear
    learnersName.clear();
    System.out.println("The List is: "+learnersName);
    }

}

