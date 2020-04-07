package ge.itvet.equalsmethod;

public class Student extends Person {
    private int classNo;

    public Student(String personalNo, int classNo) {
        super(personalNo);
        this.classNo = classNo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;

        return student.personalNo.equals(this.personalNo)
                && this.classNo == student.classNo;
    }
}
