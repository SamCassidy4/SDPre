import java.util.Scanner;
public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What is your first name?");
    String firstnameInput = keyboard.next();

    System.out.println( "What is your last name?");
    String lastnameInput = keyboard.next();

    System.out.println( "What is your favorite animal?");
    String animalInput = keyboard.next();

    System.out.println("What is your favorite food?");
    String foodInput = keyboard.next();

    System.out.println("What is your favorite song?");
    String songInput = keyboard.next();

    System.out.println("Hello, My name is " + firstnameInput + " " +  lastnameInput +".");
    System.out.println("My favorite animal is a " + animalInput+",");
    System.out.println("my favorite food is " + foodInput+",");
    System.out.println("and my favorite song is " + songInput+".");
  }
}
