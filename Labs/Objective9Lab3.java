import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true){
      printMenu();
      selection = scanner.nextInt();
      if (selection == 1){
        System.out.println("Hello World");
      }
      if (selection == 2){
        System.out.println("Banana, Rice Cakes, Cake");
      }
      if (selection == 3){
        System.out.println("Goodbye");
        break;
      }
      }
    }
      public static void printMenu() {
        System.out.println("_____Menu____");
        System.out.println("1: Say Hello ");
        System.out.println("2: List My Favorite Foods");
        System.out.println("3: Exit");
        System.out.println();
    }
  }
