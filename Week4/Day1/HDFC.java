package org.testleaf.week4.day1;
public class HDFC implements RBI{

    @Override
    public void mandateKyc() {
        System.out.println("mandateKyc is PAN CARD");
    }

    @Override
    public void setDepositLimit() {
         System.out.println("setDepositLimit is 10 Lakhs");
    }

    public static void main(String[] args) {
        HDFC hdfcOptions=new HDFC();
        hdfcOptions.mandateKyc();
        hdfcOptions.setDepositLimit();

    }

}
