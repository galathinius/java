package lab5;

public class D extends C{
    protected String d;

    D(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(d);
        super.printSelf();
    }
}
