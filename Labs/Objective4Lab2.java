import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first whole number you would like to add:");
    int firstint = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add:");
    int secondint = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add:");
    int thirdint = keyboard.nextInt();

    int sumint = firstint + secondint + thirdint;

    System.out.println("Please enter the first decimal number you would like to add:");
    double firstdub = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add:");
    double seconddub = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add:");
    double thirddub = keyboard.nextDouble();

    double sumdub = firstdub + seconddub + thirddub;

    System.out.println("The sum of: " + firstint + " + "  + secondint + " + " + thirdint + " = " + sumint);
    System.out.println("The sum of: " + firstdub + " + " + seconddub + " + " + thirddub + " = " + sumdub);
  }
}
