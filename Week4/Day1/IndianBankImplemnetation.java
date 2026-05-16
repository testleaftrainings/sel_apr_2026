package org.testleaf.week4.day1;

public class IndianBankImplemnetation extends IndianBank{

    @Override
    public void setcarLoanLimit() {
        System.out.println("setcarLoanLimit is 20 L");

   }
   
   @Override
    public void mandateKyc() {
        System.out.println("mandateKyc is PAN");
    }

    @Override
    public void setDepositLimit() {
        System.out.println("setDepositLimit is 1 CR");
    }

    public void setPersonalLoanLimit(){
    super.setPersonalLoanLimit();
    System.out.println("setPersonalLoanLimit is 5 Lakhs");
    }

    public static void main(String[] args) {
        IndianBankImplemnetation bankOptions=new IndianBankImplemnetation();
        bankOptions.setcarLoanLimit();
        bankOptions.setDepositLimit();
        bankOptions.mandateKyc();
        bankOptions.setPersonalLoanLimit();
        bankOptions.houseLoanLimit();
    }
}
