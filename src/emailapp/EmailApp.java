package emailapp;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first name:");
        String firstName = sc.nextLine();
        System.out.print("Enter the last name:");
        String lastName = sc.nextLine();
        Email em1 = new Email(firstName, lastName);
        em1.setAlternateEmail("heerarose@gmail.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
    }
}

