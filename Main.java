package ge.itvet;


import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\Games\\student.txt");
        Scanner Reader = new Scanner(file);
        while (Reader.hasNextLine()){
            String txt = Reader.nextLine();
            System.out.println(txt);
    }
            Reader.close();



    }
}
