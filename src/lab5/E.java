package lab5;

public class E extends D{
    protected String e;

    E(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(e);
        super.printSelf();
    }
}
