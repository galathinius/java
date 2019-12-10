package lab5;

public class G extends F{
    protected String g;

    G(String a, String x) {
        super(a, x);
    }

    protected void printSelf() {
        System.out.println(g);
        super.printSelf();
    }
}
