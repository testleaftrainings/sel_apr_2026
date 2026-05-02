package org.testleaf.week2.day1;

public class LearnAccessModifiers1 {
   public void learnAccess1(){
    System.out.println("learnAccess1");
    }

    private void learnAccess2(){
    System.out.println("learnAccess1");
    }

    public static void main(String[] args) {
      LearnAccessModifiers1 obj=new LearnAccessModifiers1();  
      obj.learnAccess1();
    }

}
