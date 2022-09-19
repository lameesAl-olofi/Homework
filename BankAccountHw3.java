public class BankAccountHw3 {
    private double balans;
    public BankAccountHw3(){
        balans=0;
    }
    public BankAccountHw3(double initialBalance){
        balans=initialBalance;
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
