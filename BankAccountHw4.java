public class BankAccountHw4 {
    private double balans;
    public BankAccountHw4(){
        balans=0;
    }
    public BankAccountHw4(double initialBalance){
        balans=initialBalance;
    }
    public void addlnterest(double ratr){
       balans=(balans/+ratr)+balans;
    }

    public void depoost(double amount){
        balans=balans+amount;
    }
    public void withdraw(double amount){
        balans=balans-amount;
    }
    public double getBalance(){
        return balans;
    }
}
