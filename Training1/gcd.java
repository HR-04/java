import java.util.*;

class gcd {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the First Number");
      int firstNo = sc.nextInt();
       System.out.println("Enter the Second Number");
       int secondNo = sc.nextInt();
       int gcd =1;
       
       for(int i = 1;i<=firstNo && i<=secondNo;i++){
           if(firstNo%i==0 && secondNo %i==0){
               gcd = i;
               
           }
       }
       System.out.println("The GCD of first number "+firstNo+" and second number "+secondNo+" is : "+gcd);
      
    }
}