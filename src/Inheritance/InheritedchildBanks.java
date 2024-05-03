package Inheritance;


    class RBC extends BankOfCanada {
        public RBC(String accountInfo, int accountNo, double mortgageRate) {
            super(accountInfo, accountNo, mortgageRate);
        }

        public void printRBCInfo() {
            System.out.println("RBC Bank Info : ");
            printBankDetails();
            printMortgateRate();
        }



}
