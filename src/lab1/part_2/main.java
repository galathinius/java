package lab1.part_2;

public class main {
    public static void main(String[] args){
        University USM = new University();
        University UTM = new University();
        University ASEM = new University();

        Student student_1 = new Student();
        Student student_2 = new Student();
        Student student_3 = new Student();
        Student student_4 = new Student();
        Student student_5 = new Student();
        Student student_6 = new Student();

        student_1.mark = 8.76;
        student_2.mark = 9.34;
        student_3.mark = 7.82;
        student_4.mark = 8.94;
        student_5.mark = 6.31;
        student_6.mark = 8.78;

        UTM.students.add(student_1);
        UTM.students.add(student_2);
        USM.students.add(student_3);
        USM.students.add(student_4);
        ASEM.students.add(student_5);
        ASEM.students.add(student_6);

        double media = ( UTM.computeAverageMark() + USM.computeAverageMark() + ASEM.computeAverageMark() ) / 3;

        System.out.println(media);
    }
}
