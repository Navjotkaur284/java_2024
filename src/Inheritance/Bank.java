package Inheritance;

public class Bank {

    protected String accountInfo;
    protected int accountNo;

    public Bank(String accountInfo, int accountNo){
        this.accountInfo = accountInfo;
        this.accountNo = accountNo;
    }

    public void printBankDetails() {
        System.out.println("AccountInfo" + accountInfo);
        System.out.println("AccountInfo" + accountNo);
    }

}
