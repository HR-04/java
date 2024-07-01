import java.util.Scanner;


class FloatTwo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Value here :");

        float value = scanner.nextFloat();
        System.out.printf("The Formatted Number : %.2f\n" ,value);
        scanner.close(); 
    }
}