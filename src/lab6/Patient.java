package lab6;

public class Patient extends Person{
    String id;
    String name = super.name;
    String gender = super.gender;
    String birthDate = super.birthDate;
    int age;
    String accepted;
    String sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;

}
