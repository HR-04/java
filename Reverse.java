import java.util.*;

class Reverse {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word:");
       String word = sc.nextLine();
       String Reverse = "";
       for(int i=word.length()-1;i>=0;i--){
           Reverse+=word.charAt(i) ;
       }
       System.out.println("The reversed word is : "+ Reverse );
    }
}