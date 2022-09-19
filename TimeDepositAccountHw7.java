public class TimeDepositAccountHw7 {
    private double balans;
    private double re;
    public TimeDepositAccountHw7(double initialBalance ,double interestre){
        balans=initialBalance;
        re=interestre;
    }
    public void addinterester()
    {

    }
    public void getre(){
        balans=(balans/+re)+balans;
    }
    public void withdraw(){
        balans=0;
    }
    public double getBalance(){
        return balans;
    }
}
