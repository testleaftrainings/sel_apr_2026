package org.testleaf.week1.day2;

public class LearnElseIf {

    public static void main(String args[]){
        int number=0;
//           0>0
        if(number>0){
        System.out.println("the number is positive");
        }
        //       0<0
        else if(number<0){
          System.out.println("the number is negative");  
        }

        else{
            System.out.println("the number is zero"); 
        }
        
    }

}
