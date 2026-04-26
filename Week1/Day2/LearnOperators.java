package org.testleaf.week1.day2;

public class LearnOperators {

    //Assignment operator - Assign a value to a variable  (=)
    //Mathematical/Arithmetic Operator
    //Comparison Operator
    //Logical Operator
    //Increment and Decrement Operator

    public static void main(String[] args) {

        //Assignment operator - Assign a value to a variable  (=)
        int number=7;
        System.out.println(number);

        //Mathematical/Arithmetic Operator
        //add, sub, mul, div, mod
        int a=10;
        int b=3;

        //add (+)
        System.out.println(a+b);

        //sub  (-)
        System.out.println(a-b);

       //mul (*)
       System.out.println(a*b);

       //div
       //quotient    (/)
       System.out.println(a/b);  //3
      
       //remainder   (%)
       System.out.println(a%b);  //1

       //Comparison Operator
       //Compares the 2 values and gives bolean as return
       
       int c=5;
       int d=7;
       //equalTo  (==)
       System.out.println(c==d);  //5==7 --->false

       //notEqualTo  (!=)
      System.out.println(c!=d);           //5!=7

     //greaterThan     (>)
     System.out.println(c>d);      //5>7
     
     //smallerThan   (<)
     System.out.println(c<d);    //5<7

     //greaterThanOrEqualTo      //greaterThan  or   EqualTo   >=
      System.out.println(c>=d);   //5>7      or         5==7

      //smallerThanOrEqualTo     smallerThan    or   equalTo
      System.out.println(c<=d);   //5<7         or   5==7

      //Logical Operator   compare 2 conditions
      
      int m=21;
      int n=20;

      //and   &&               condition1   and   condition2
      System.out.println(m<n&&m>n);  //21<20    21>20

      //or    ||              condition1    or   condition2
      System.out.println(m<n||m>n);   //21<20    or   21>20

      ////Increment and Decrement Operator
      int v=7;
      //Increment     - Increase the value by 1   
      
      //postIncrement - Increase the value by 1   v++
      System.out.println(v++);   //7
      System.out.println(v);     //8
      //preIncrement  - Increase the value by 1   ++v
      System.out.println(++v);    //9

      //Decrement
      //postDecrement - Decrease the value by 1  v--
      System.out.println(v--);   // 9
      
      //preDecrement   - Decrease the value by 1
      System.out.println(--v);  //7

    int x=5;

    //What is the value of  x++ + x-- - --x?
       System.out.println(x++ + x-- - --x);            

    }

}
