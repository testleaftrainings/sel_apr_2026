package org.testleaf.week4.day1;

public class CalculatorFunction {

  //add two numbers
    public void addNumbers(int a,int b){
    System.out.println(a+b);
    }

    //add three numbers
    public void addNumbers(int d,int b,int c){
    System.out.println(d+b+c);
    }

    //add 2 decimal numbers
     public void addNumbers(float x, float y){
    System.out.println(x+y);
    }

    public static void main(String[] args) {
        CalculatorFunction calcOptions=new CalculatorFunction();
        //calcOptions.addNumbers(5, 10);
        //calcOptions.addNumbers(2.5f, 7.5f);
        calcOptions.addNumbers(1, 4, 3);
    }
}
