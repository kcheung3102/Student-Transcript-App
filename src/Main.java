import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);
        ArrayList<Transcript> courses = new ArrayList<>();

        String answer = "y";
        Transcript joe = new Transcript();
        System.out.println("Welcome to transcript App.");
        System.out.println("Enter Student ID number: ");
        joe.setiD(userInput.nextInt());
        System.out.println("Enter Students First Name");
        joe.setFirstName(userInput.nextLine());
        System.out.println("Enter Students Last Name");
        joe.setLastName(userInput.nextLine());


    }




}
