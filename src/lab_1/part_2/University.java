package lab_1.part_2;
import java.util.ArrayList;

public class University {
    // name, foundationYear and a list of students created earlier
    String name;
    int foundationYear;
    ArrayList < Student > students = new ArrayList < Student > ();

    double computeAverageMark() {
        int studentsNumber = students.size();
        double averageMark = 0;

        for ( int i = 0; i < studentsNumber; i++ ) {
            averageMark += this.students.get(i).mark;
        }
        averageMark /= studentsNumber;

        return averageMark;
    }
}
