package lab5;

public class H extends G{
    protected String h;

    H(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(h);
        super.printSelf();
    }
}
