package org.testleaf.week4.day1;

public abstract class IndianBank implements RBI{
    //both implemented and unimplemented methods

    public abstract void setcarLoanLimit();

    public void setPersonalLoanLimit(){
    System.out.println("setPersonalLoanLimit is 2 Lakhs");
    }


}
