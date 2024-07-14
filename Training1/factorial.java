import java.util.*;

class factorial {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
       int n = sc.nextInt();
      
       int factorial = 1;
       for(int i=1;i<=n;i++){
           factorial *= i;
       }
       System.out.println("The "+n+" factorial is : "+factorial);
       
        }
    }