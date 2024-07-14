import java.util.*;

class guessno {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      int numberofguess = random.nextInt(100)-1;
      int numberoftries = 0;
      int guess;
      Boolean win = false;
      System.out.print("Enter the number: " );
      
      while(!win){
        guess = sc.nextInt();
        numberoftries++;
        
        if(guess < numberofguess){
            System.out.println("The number is too small");
        }
        else if(guess > numberofguess){
            System.out.println("The number is too big");
        }
        else{
            win = true;
            System.out.println("you Guessed the correct number!!");
            System.out.println("Number of tries is: " + numberoftries);
        }
      }
    }
}