package lab5;

public class A {
    protected String a;
    protected X x = new X("xxx");

    A(String a, String x) {
        super();
        this.a = a;
    }

    protected void printSelf() {
        System.out.println(a);
    }
}
