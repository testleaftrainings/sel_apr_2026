package week7.day2;

public class LearnConstructor {
    /**
     * constructors are used to initialize the state of the object
     * constructor name should be same as that of the classname but it doesnot have the 
     * returntype
     * types:
     * 1)default constructor--->has no arguments
     * 2)Parmeterized--->has the arguments
     * thisKeyword:refers to current class object
     *  it is used to differentite the local and global varibles
     * -to call one constructor from other constructor
     * constructor overloading:having more than one constructor inside a class with differnt arguments.
     * constructor chaining:
     * calling one constructor from other constructor.
     */

    int empID;
    String empName;
    boolean empStatus;

    public LearnConstructor(){
        //empID=46;
        //this(90, "ss", true);
        System.out.println("default constructor");
    }
    public LearnConstructor(int empID,String empName,boolean empStatus){
        this();
        System.out.println("parameterized constructor");
        this.empID=empID;
        this.empName=empName;
        this.empStatus=empStatus;
        
    }


    public static void main(String[] args) {
         LearnConstructor lc1=new LearnConstructor(78, "saran", true);
         System.out.println(lc1.empID+" "+lc1.empName+" "+lc1.empStatus);
        // LearnConstructor lc=new LearnConstructor();
        // System.out.println(lc.empID+" "+lc.empName+" "+lc.empStatus);
        

    }

}
