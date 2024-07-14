import java.util.*;

class CountOccurrences {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Word : ");
      String word = sc.nextLine();
       System.out.print("Enter the Character to Count : ");
       char ch = sc.nextLine().charAt(0);
       int count = 0;
       
       for(int i = 0;i<word.length();i++){
           if(word.charAt(i) == ch){
               count++;
               
           }
       }
       System.out.println("The ch"+ch+" count is " +count);
      
    }
}