package org.testleaf.week2.day1;

public class Redmi {
    
   public String takeMultiplePhotos(){
    int numberOfPhotos=5;
    System.out.println(numberOfPhotos);
    return "numberOfPhotos";
   }

    public static void main(String[] args) {
        Redmi redmiOptions=new Redmi();
        String number=redmiOptions.takeMultiplePhotos()+100;
        //System.out.println(number);
        
    }

}
