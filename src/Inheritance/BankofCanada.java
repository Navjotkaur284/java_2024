package Inheritance;

     class BankOfCanada extends Bank {
        double mortagateRate;

        public BankOfCanada(String accountInfo, int accountNo, double mortagateRate){

            super(accountInfo , accountNo);
            this.mortagateRate = mortagateRate;
        }

        public void printMortgateRate(){
            System.out.println("Mortgate Rate "  + mortagateRate );

        }

}
