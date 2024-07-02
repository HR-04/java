public class peak {
    public static void findPeak(int[] arr){
        int n = arr.length;
        for(int i=0 ;i < n ;i++){
            if ((i == 0 || arr[i] >= arr[i - 1]) && (i == n - 1 || arr[i] >= arr[i + 1])) {
                System.out.println("Peak Element:" + arr[i]);
            }   
        }   
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,4,3,2,1};
        findPeak(arr);
    }  
}