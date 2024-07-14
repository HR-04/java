import java.util.*;

class armstrongNo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int number = sc.nextInt();
      int originalNo = number;
      int result = 0;
      int n=0;
      
      for(int temp=number;temp!=0;temp/=10,++n);
          for(int temp =number;temp!=0;temp/=10){
              int digit = temp%10;
              result += Math.pow(digit ,n);
          }
        if(result == originalNo){
              System.out.println("The number is Armstrong No");
          }
          else{
              System.out.println("The number is not Armstrong No");
          }
      }
    }