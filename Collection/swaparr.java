class swaparr{
    public static void main(String [] args )throws Exception{

        int [] arr = {1,2,3,4,5};
        swapno(arr);
        for(int swappedNo:arr){
        System.out.print(swappedNo);
        }


    }

    public static void swapno(int[] arr){
        for(int i=0;i<arr.length-1;i+=2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]=temp;
            
        }
        }
    
}