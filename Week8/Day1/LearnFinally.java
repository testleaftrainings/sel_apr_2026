package week8.day1;

public class LearnFinally {
    public static void main(String[] args) {
        int x=8;
        int y=0;
        //int num[]={1,2,3};
        
        try {
            System.out.println(x/y);//2
            
         }// catch (Exception e) {
        //     System.out.println(e);
        // }
        finally{
            System.out.println("done");
        }
        System.out.println("completed");
    }

}
