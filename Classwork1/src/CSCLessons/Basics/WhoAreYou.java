package CSCLessons.Basics;

import java.util.Scanner;
/**
 * Vishal Nigam
 * 1/22/18
 */
public class WhoAreYou {
    public static void main(String[]args){
        System.out.println("Hello, what is your first name?");
        Scanner x = new Scanner(System.in);
        String first = x.nextLine();
        System.out.println("Thank you. What is your last name?");
        String last = x.nextLine();
        System.out.println("Nice to meet you, "+first+" "+last+".");
    }
}
