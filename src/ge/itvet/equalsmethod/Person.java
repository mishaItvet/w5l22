package ge.itvet.equalsmethod;

public class Person {
    protected String personalNo;

    public Person(String personalNo) {
        this.personalNo = personalNo;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return this.personalNo.equals(other.personalNo);
    }
}
