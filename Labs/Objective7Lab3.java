public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter;
    counter = 0;

    do{
      counter = counter + 1;
      if(counter % 2 == 0){
        System.out.println(counter + " is even");
      }else {
        System.out.println(counter + " is odd");
      }
    } while(counter <= 19);
  }
}
