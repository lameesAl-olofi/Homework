public class BankAccountHw8 {
    private double balans;
    private double mo;
    public BankAccountHw8(double initialBalance){
        balans=initialBalance;
    }
    public void depoost(double amount , int mo){
        balans=balans+amount;
        if((mo>5)&&(mo<=12))

        {
            balans=balans-1;
        }

    }
    public void withdraw(double amount, int mo){
        balans=balans-amount;
        if((mo>5)&&(mo<=12))

        {
            balans=balans-1;
        }

    }
    public double getBalance(){
        return balans;
    }
}
