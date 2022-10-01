import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    Scanner input = new Scanner(System.in);

    currentYear = 2022;

    System.out.println("How old are you?");
    age = input.nextInt();
    birthYear = 2022 - age;

    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
