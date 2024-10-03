package app;
import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you salary");
        double salary = scan.nextDouble();
        if (salary > 0 && salary <= 10000){
            System.out.printf("You tax is %.2f", salary * 0.025);
        } else if (salary > 10000 && salary <= 25000) {
            System.out.printf("You tax is %.2f", salary * 0.043);
        } else if (salary > 25000) {
            System.out.printf("You tax is %.2f", salary * 0.067);
        } else {
            System.out.println("Salary can't be less than 0");
        }
    }
}
