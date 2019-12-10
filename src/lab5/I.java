package lab5;

public class I extends H{
    protected String i;

    I(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(i);
        super.printSelf();
    }
}
