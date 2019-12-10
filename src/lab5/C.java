package lab5;

public class C extends B{
    protected String c;

    C(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(c);
        super.printSelf();
    }
}
