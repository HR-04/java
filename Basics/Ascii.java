import java.util.Scanner;

public class Ascii{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Character:");
        char inputChar = scanner.next().charAt(0); 
        int asciivalue = (int)inputChar; // Converts the char into Ascii value which is int
        System.out.println("The character value of "+ inputChar +" is "+ asciivalue);
        scanner.close();
    }
}