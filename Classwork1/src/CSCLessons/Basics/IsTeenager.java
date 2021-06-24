package CSCLessons.Basics;

import java.util.Scanner;
/**
 * Vishal Nigam
 * 1/22/18
 */
public class IsTeenager {
    public static void main(String[]args){
        System.out.println("What is your age?");//Prompts user for age (Int)
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        if(y<13||y>19){//Checks if input variable is or is between 13 or 19.
            System.out.println("You are not a teenager.");
        }
        else System.out.println("You are a teenager.");
    }
}
