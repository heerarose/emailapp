package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;
    private int defaultPasswordLength = 10;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department : " + this.department);

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your Password is : " + this.password);
    }

    // Ask for the department
    private String setDepartment(){
        System.out.print("DEPARTMENT CODES: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for None \n Enter Department Code : ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1){
            return "Sales";
        }
        else if (deptChoice == 2){
            return "Development";
        }
        else if (deptChoice ==3){
            return "Accounting";
        }
        else{
            return " ";
        }

    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*+_/*-";
        char[] password = new char[length];
        for(int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);

    }

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password
}
