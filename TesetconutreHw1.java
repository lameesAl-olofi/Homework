public class TesetconutreHw1 {
    public static void main(String[] args) {
        CountreHw1 s=new CountreHw1();
        System.out.println("the value after builldinr = " +s.getvalue());
        s.click();
        s.click();
        s.click();
        s.retreat();
        System.out.println("the value after builldinr = " +s.getvalue());
    }
}
