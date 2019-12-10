package lab5;

public class J extends I{
    protected String j;

    J(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(j);
        super.printSelf();
    }
}
