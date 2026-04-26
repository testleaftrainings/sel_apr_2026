package org.testleaf.week1.day2;

public class LearnForLoop {

    public static void main(String args[]){
        //Print numbers from 1 to 5

       //starting point, initial  = 1
      //ending point, termination= 5
      //increment/decremnet      = ++

      //    1  2  3  4  5
      for(int i=1;i<=5;i++){
        System.out.println(i);
        //System.out.println(1);   //1
        //System.out.println(2);   //2
        //System.out.println(3);   //3
        //System.out.println(4);   //4
        //System.out.println(5);   //5
      }


     System.out.println("-------------------------------");


      //Print numbers from 5 to 1
      //   5      4      3     2     1
      //starting number=5
      //ending number = 1
      //decrement     = i--

      //5   4   3   2   1   0   -1    -2
      for(int i=5;i>=1;i--){
        System.out.println(i);
      }
  }

}
