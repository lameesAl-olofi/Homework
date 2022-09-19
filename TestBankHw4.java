public class TestBankHw4 {
    public static void main(String[] args) {
        BankAccountHw4 s=new BankAccountHw4() ;

        s.depoost(1000);
        s.addlnterest(10) ;
        System.out.println(s.getBalance());



    }
}
