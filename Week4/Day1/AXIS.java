package org.testleaf.week4.day1;

public class AXIS  implements RBI{

@Override
    public void mandateKyc() {
        System.out.println("mandateKyc is DL");
    }

    @Override
    public void setDepositLimit() {
         System.out.println("setDepositLimit is 50 Lakhs");
    }

    //Needs HouseLoanLimit

  public static void main(String[] args) {
    AXIS axisOptions=new AXIS();
    axisOptions.houseLoanLimit();
    //RBI.houseLoanLimit();

  }

}
