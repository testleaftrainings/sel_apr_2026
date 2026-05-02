package org.testleaf.week2.day1;

public class IPhone {

    public void takePhoto(int number,String fileName){
       //int number=21;    //Local Variable
       System.out.println(number+" "+fileName); 
    }

    public static void main(String[] args) {
        //ClassName object=new ClassName();
        IPhone iphoneOptions=new IPhone();
        iphoneOptions.takePhoto(7, "vineeth.png");
        iphoneOptions.takePhoto(10, "harrish.jpeg");
        
    }

}
