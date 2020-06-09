package ge.itvet.equalsmethod;

public class Person {
    protected String personalNo;

    public Person(String personalNo) {
        this.personalNo = personalNo;
    }

    @Override
    public boolean equals(Object o) {
 /*       if (!(o instanceof Person)) return false;
        Person other = (Person) o;
        return this.personalNo.equals(other.personalNo);*/

        if (o instanceof Person)
            return this.equalsPerson((Person) o);
        return false;
    }


    private boolean equalsPerson(Person otherPerson) {
        if (otherPerson == null) return false;
        if (this.personalNo == null || otherPerson.personalNo == null) return false;
        return this.personalNo.equals(otherPerson.personalNo);
    }

}
