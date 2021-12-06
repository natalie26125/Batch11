package ifStatement;

import java.util.Scanner;

public class ifPractice {
    public static void main(String[] args) {
        // get a number between 1 to 7 from user
        //print the name of the day for that given number from user
        // 1--> Monday
        // 2--> Tuesday
        //.....
        // 7--> Sunday
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number between 1 to 7");
        int number = sc.nextInt();
        if(number ==1){
            System.out.println("Monday");
        }
    if(number == 2){
        System.out.println("Tuesday");
    }
    if(number == 3){
        System.out.println("Wednesday");
    }
    }
}
