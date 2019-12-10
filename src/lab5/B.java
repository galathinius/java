package lab5;

public class B extends A{
    protected String b;

    B(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(b);
        super.printSelf();
    }
}
