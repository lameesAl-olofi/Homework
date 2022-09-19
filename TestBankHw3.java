public class TestBankHw3 {
    public static void main(String[] args) {
       BankAccountHw3 d=new BankAccountHw3();
       d.depoost(1000);
       d.withdraw(500);
       d.withdraw(400);
        System.out.println(d.getBalance());
    }
}
