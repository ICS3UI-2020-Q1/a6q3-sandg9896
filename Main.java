import java.util.Scanner;
/**
 * find the largest value inside of that array
 * @ Gavin 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    
    // create array with 10 spots
    int[] integers = new int[10];

    // ask user to enter ten numbers
    System.out.println("Please enter in 10 integers to put into the array");

    // put integers into array using loop
    for(int i = 0; i < integers.length; i++){
     integers[i] = input.nextInt();
    }
    
    // create for loop to determine greatest number
    for(int i = 0; i < integers.length; i++){
      if(integers[i] > integers.length)
      System.out.println("The largest number is " + integers[i]);
    } 
    
  }
}
