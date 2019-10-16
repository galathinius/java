package lab1.part_1;

public class name {
    public static void main(String[] args) {
        Monitor smth_1 = new Monitor();
        Monitor smth_2 = new Monitor();

        smth_1.diagonal = 10;
        smth_2.diagonal = 20;
        Comparison text = new Comparison();
        text.diagonal_comparison(smth_1.diagonal,smth_2.diagonal);


    }
}
