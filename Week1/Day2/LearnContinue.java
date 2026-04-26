package org.testleaf.week1.day2;

public class LearnContinue {
    //continue - it will skip the current iteration and exceute the remaining iterations

        public static void main(String args[]){
//      1   2   3   4   5
        for(int i=1;i<5;i++){
//             3==3
            if(i==3){
            continue;
            }

        System.out.println(i);  //1   2   4   5
        }

    }

}  

