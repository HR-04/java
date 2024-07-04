// public class main{
//     public static void main(String[] args){
//         int[] arr1 = {1,2,3,4,5};
//         int[] arr2 = {2,4,5,6,7};
//         union(arr1,arr2);


//         System.out.println("Print the Union array",count);

//     }
//     public static int union(int arr1,int arr2){
//         for(int i = 0;i<arr1.length;i++){
//             for(int j =0;j<arr2)
//         }
//     }
// }



import java.util.Scanner;
import java.io.*;


public class InterUnion{
    static int count =0;
    public static void main(String args[])
    {

    int n,n1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no. of elements for first array");
    n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of first array");
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();

    }
    System.out.println("Enter no. of elements for second array");
    n1=sc.nextInt();
    int arr1[]=new int[n1];
    System.out.println("Enter the elements of second array");
    for(int i=0;i<n1;i++)
    {
        arr1[i]=sc.nextInt();

    }
    unique_ele(arr,arr1);
    unique_ele(arr1,arr);
    System.out.println("The number of unique elements are");
    System.out.println(count);
    }
    public static int unique_ele(int arr2[],int arr3[])
    {
        boolean contains = false;
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr3.length;j++)
            {
                if (arr2[i] == arr3[j]) {
                    contains = true;
                    break;
                }            

            }
             if(!contains){
               count++;
            }
            else{
                contains = false;
            }
        }

        return count;    
    }

}