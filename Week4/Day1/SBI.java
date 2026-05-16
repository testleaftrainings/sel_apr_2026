package org.testleaf.week4.day1;

public class SBI implements RBI {

    @Override
    public void mandateKyc() {
        System.out.println("mandateKyc is AADHAAR CARD");
    }

    @Override
    public void setDepositLimit() {
        System.out.println("setDepositLimit is 20 Lakhs");
    }

    public static void main(String[] args) {
        SBI sbiOptions =new SBI();
        sbiOptions.mandateKyc();
        sbiOptions.setDepositLimit();
    }   

}
