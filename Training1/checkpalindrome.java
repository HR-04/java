import java.util.*;

class checkpalindrome {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the string: " );
      String word = sc.nextLine();
      String Reverse= "";
      
      for(int i=word.length()-1;i>=0;i--){
         Reverse += word.charAt(i);
      }
         if (word.equals(Reverse)){
             System.out.println(word+ " the word is palindrome ");
         }
         else{
              System.out.println(word+ " the word is not palindrome ");
         }
      
    }
}