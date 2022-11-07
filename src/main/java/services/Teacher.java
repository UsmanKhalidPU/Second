package services;
import java.util.Scanner;

public class Teacher {
    public static void main(String args[])
    {
        System.out.println("Input Your Teacher Name: ");
        Scanner s = new Scanner(System.in);
        String number = s.nextLine();

        System.out.println("Teacher name is : " + number );
    }
}
