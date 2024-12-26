import java.util.*;
public class loopsnumbersguessing {
    public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Welcome");
       int guess = (int)(Math.random()*10); //10 is used to take input of a single digit if you want to double then multiply by 100
       while (true) { 
        System.out.println("Enter what you have guessed:");   
        int n=sc.nextInt();
        if(n== guess) {
          System.out.println("Correct guess");
          break;
        }
        else {
          System.out.println("Try again nab");
        }
       }
    }
    }
}
