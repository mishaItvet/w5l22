package ge.itvet;

import ge.itvet.equalsmethod.Bar;
import ge.itvet.equalsmethod.Foo;
import ge.itvet.equalsmethod.Person;
import ge.itvet.equalsmethod.Student;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Student S_irakli = new Student("74108520963", 6);
        Person P_iko = new Person("74108520963");

        System.out.println("Student equals person  " + S_irakli.equals(P_iko)); // false
        System.out.println("Person equals Student  " + P_iko.equals(S_irakli)); // true

        System.out.println(new Foo(7).equals(new Foo(7)));
    }
}
