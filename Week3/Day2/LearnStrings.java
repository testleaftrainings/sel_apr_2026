package org.testleaf.week3.day2;

public class LearnStrings {

    public static void main(String args[]) {
        //String Literal
        String str1="TestLeaf";
        String str3="Testleaf";
        
        //String Instantiation
        String str2=new String("TestLeaf");

        String str4=new String("TestLeaf");

        //. equals - compare the exact value of two Strings
        System.out.println(str1.equals(str3));        
        
        //  ==     -compares the reference address of two Strings
        System.out.println(str1==str3);
        System.out.println(str1==str2);
        System.out.println(str1==str3);

        //contains vs equals
        //.equals - compare the exaxt value
        //contains- compare the partial value
        
        //contains
        System.out.println(str1.contains(str2));

        System.out.println("--------------------");

        String batchName="SeleniumApril";
        String batch="seleniumapril";


//equalsIgnoreCase
System.out.println(batchName.equalsIgnoreCase(batch));

//               01234567
    String name="Selenium";

    //To count the number of Characters in a String - length()
    int lengthOfString = name.length();
    System.out.println("lengthOfString is "+lengthOfString);

//To retreive/get a Character based on index - charAt
char charAtIndex3 = name.charAt(3);
System.out.println("charAtIndex3 is "+charAtIndex3);


//toCharArray - convert the String into Character Array
char[] charArray = name.toCharArray();
//Selenium    - {'S','e','l','e','n','i','u','m'}

System.out.println(charArray[0]);

//           0123456789
String rate="tenpercent";

//subString - Convert the String into its shorter format
//TestLeaf

//subString with 1 argument
String substring = rate.substring(3);
System.out.println("substring is : "+substring);

//subString with 2 arguments
String substring2 = rate.substring(3, 6);
System.out.println("substring2 is : "+substring2);

//split - convert a string into multiple Strings
String batName = "Selenium April 2026";  //     0          1        2
String[] split = batName.split(" ");    // {"Selenium" ,"April", "2026"}
System.out.println(split[0].charAt(3));

//toUppercase - to convert String entirely into uppercase
String upperCase = batName.toUpperCase();   //  Selenium April  ---> SELENIUM APRIL
System.out.println("upperCase is : "+upperCase);
//toLowerCase - to convert String entirely into lowercase

//replaceAll

int rupess=1000;
String percent="5percent";
String updatedString = percent.replaceAll("[^0-9]", "");
System.out.println("replaceAll is : "+updatedString);
System.out.println(rupess+updatedString); 
             
//convert String into int
int updatedInt = Integer.parseInt(updatedString);
System.out.println(rupess+updatedInt);
   }
}
