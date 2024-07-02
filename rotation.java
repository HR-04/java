import java.util.Arrays;

public class rotation{
    public static void main(String[] args){
        int d=2;
        int [] arr = new int [] {1,2,3,4,5};
        for(int i=0;i<=2;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] =arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}