public class CountreHw2 {
    private int value;

    public CountreHw2(){

        value=0;
    }
    public void click(){

        int a=10;
        if(value<a)
        {
            value=value+1;
        }
        else
            value=a;
    }
    public int getvalue(){
        return value;
    }

    public void recet(){
        value=0;
    }
}
