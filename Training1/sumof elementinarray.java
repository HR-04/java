import java.util.*;

class sumofelementofarray{
    public static void main(String[] args) {
    //   Scanner sc = new Scanner(System.in);
    //   System.out.print("Enter the word: ");
       int [] n = {1,2,3,4,5,6};
       int sum = 0;
        for(int num : n){
            sum += num;
        }
        System.out.println("The sum of array is "+ sum);
    }
}