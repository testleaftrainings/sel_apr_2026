package org.testleaf.week4.day1;

public interface RBI {

public void mandateKyc();

public void setDepositLimit();

default  void houseLoanLimit(){
    System.out.println("houseLoanLimit is 1 CR");
}

}
