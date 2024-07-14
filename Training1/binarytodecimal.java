import java.util.*;

class binarytodecimal {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the Binary number: ");
      String binary = sc.nextLine();
      int base=1;
      int decimal = 0;
      
      
      for(int i = binary.length()-1;i>=0;i--){
          if(binary.charAt(i)=='1'){
              decimal+=base;
          }
          base*=2;
      }
             System.out.println("Decimal equivalent: " + decimal);
      }
    }