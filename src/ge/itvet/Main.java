package ge.itvet;

import ge.itvet.equalsmethod.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("შემოიტანეთ სტუდენტის პირადი ნომერი");
        String pn = scanner.next();
        System.out.println("შემოიტანეთ სტუდენტის კლასის ნომერი");
        Integer classNo = scanner.nextInt();

        Student student = new Student(pn, classNo);
        FileOutputStream fos = new FileOutputStream("D:\\Java\\student.txt");

        fos.write(student.toString().getBytes());
    }

}
