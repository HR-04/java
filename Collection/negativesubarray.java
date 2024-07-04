import java.util.Scanner;

class negativesubarray{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array =new int[n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }

        int negativesubarray = 0;

        for(int start=0;start<n;start++){
            int sum=0;
            for(int end=start;end<n;end++){
                sum+=array[end];
                if(sum<0){
                    negativesubarray++;
                }
            }
        }
    System.out.println(negativesubarray);

    }
}