public class BankAccountHw6 {
    private double balans;
    private double re;
    public BankAccountHw6(double initialBalance ,double interestre){
        balans=initialBalance;
        re=interestre;
    }
    public void addinterester()
    {
        balans=(balans/+re)+balans;
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
