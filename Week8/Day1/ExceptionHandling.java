package week8.day1;

public class ExceptionHandling {

    public static void main(String[] args) {
        
        int x=8;
        int y=0;
        int num[]={1,2,3};
        
        try {
            System.out.println(x/y);//2
            
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            System.out.println(num[4]);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("completed");
    }
}
