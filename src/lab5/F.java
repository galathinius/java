package lab5;

public class F extends E{
    protected String f;

    F(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(f);
        super.printSelf();
    }
}
