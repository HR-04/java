import java.util.*;

class AvgNo {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of elements : ");
      int n = sc.nextInt();
      double sum = 0.0;
      
       System.out.print("Enter the elements : ");
       for(int i = 0;i<n;i++){
           double num = sc.nextDouble();
           sum+=num;
       }
       double avg = sum/n;
       System.out.println("The avg of the number is : " + avg);

      
    }
}