import java.util.Random;
        
    public class BankAccount{

        //attributes
        private String accountNumber;
        private double checkingBalance;
        private double savingsBalance;

        public static int totalAccounts;
        public static double totalHoldings;
        private static String genAccount(){
            String nums= "";
            Random r =new Random();
            for( int i=0; i<=10;i++){
                nums += r.nextInt(10);
            }
            return nums;
        }

        
        //Constructor
        public BankAccount(){
            this.accountNumber =genAccount();
            this.checkingBalance = 0;
            this.savingsBalance = 0;
            this.totalAccounts = this.totalAccounts+1;
        }

        //GNS
        public String getAccountNumber(){
            return accountNumber;
        }
        public void setAccountnumber(String accountNumber){
            this.accountNumber = genAccount();
        }

        public double getSavingsBalance(){
            return savingsBalance;
        }
        public void setSavingsBalance(double savingsBalance){
            this.savingsBalance = savingsBalance;
        }
        
        public double getCheckingBalance(){
            return checkingBalance;
        }
        public void setCheckingBalance( double checkingBalance){
            this.checkingBalance = checkingBalance;
        }
        
    //methods
        public void deposit(String account, double amount) {
            if( account.equals("Savings")){
                double newSavingsBalance = this.getSavingsBalance()+amount;
                this.setSavingsBalance(newSavingsBalance);
            }
            else if( account.equals("Checking")){
                double newCheckingBalance= this.getCheckingBalance()+ amount;
                this.setCheckingBalance(newCheckingBalance);
            }
            BankAccount.totalHoldings += amount;
        }
        public void withdraw( String account, double amount) {
            boolean successful = false;

            if( account.equals("Savings")){
                if(this.getSavingsBalance()-amount >= 0){
                    successful = true;
                    this.setSavingsBalance(getSavingsBalance()-amount);
                }
            }

            else if(account.equals("Checking")){
                if(this.getCheckingBalance()-amount >= 0){
                    successful = true;
                    this.setCheckingBalance(getCheckingBalance()-amount);
                }
            }
            if(successful) {
                BankAccount.totalHoldings -= amount;
            }
        }
        public void totalMoney() {
            System.out.println( this.getCheckingBalance() + this.getSavingsBalance());
            
        }
}
