package org.testleaf.week3.day1;
import java.util.Arrays;
public class LearnArrays {

public static void main(String[] args) {
    //Store scores of a person 5 subjects
//            0  1   2  3  4
int[] scores={87,98,100,76,56};
//scores[0]=87;
//scores[1]=98;
//scores[2]=100;
//scores[3]=76;
//scores[4]=56;

//length - To find the number of elements in the array
int lengthOfArray=scores.length;
System.out.println("lengthOfArray is: "+lengthOfArray);

//To retrieve a value - based on index
System.out.println(scores[3]);

//To retrieve the entire value
//  0   1   2   3   4
for(int i=0;i<lengthOfArray;i++){
    System.out.println(scores[i]);
    //System.out.println(scores[0]);   //87
    //System.out.println(scores[1]);  // 98
    //System.out.println(scores[2]);  //100
    //System.out.println(scores[3]);  //76
    //System.out.println(scores[4]);   //56
    }

   //To get the highest and lowest number
   //Sort the Array - arranage the numbers from lowest to highest (ascending)

   Arrays.sort(scores);
   // 0  1  2  3   4
   //{56,76,87,98,100}
   System.out.println("The lowest is: "+scores[0]);
   System.out.println(scores[lengthOfArray-1]);

   //Arrays:
   //Instantiation
   int[] marks=new int[10];
   marks[0]=100;
   marks[1]=76;
   marks[2]=90;
   marks[3]=89;
   marks[4]=67;

      }
}
                        