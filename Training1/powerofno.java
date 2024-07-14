import java.util.*;

class powerofno {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of base: " );
      int base = sc.nextInt();
    System.out.print("Enter the number of exponent: " );
      int exponent = sc.nextInt();
      int result = 1;
      
      for(int i=1;i<=exponent;i++){
         result *=base;
      }
     System.out.println("The number " + base + " exponent "+exponent+" is :  " +result);
    }
}