import java.util.*;

class CountVowels{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the word: ");
       String n = sc.nextLine().toLowerCase();
       int count = 0;
        for(int i = 0;i<n.length();i++){
            char ch = n.charAt(i);
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
            
        }
        System.out.println("The Vowel count is "+ count);
    }
}