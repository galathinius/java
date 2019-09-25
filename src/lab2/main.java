package lab2;

public class main {
    public static void main(String[] args) {
        Queue que1 = new Queue();
        Queue que2 = new Queue(5);



        que1.push("ab");
        que1.push("cd");
        que1.push("ef");

        que2.push("qw");
        que2.push("er");
        que2.push("ty");

        System.out.println(que2.size);

        System.out.println(que1.isFull());
        System.out.println(que2.isFull());

        System.out.println(que1.pop());
        System.out.println(que2.pop());

        System.out.println(que2.isFull());

        Box cutie = new Box(2, 3, 4);
        System.out.println(cutie.Surface());
        System.out.println(cutie.Volume());



    }
}
