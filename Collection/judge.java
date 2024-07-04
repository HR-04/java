import java.util.Scanner;

class judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a  = 1;
        int[] array = new int[10];

        while (true) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;  // Stop processing when 0 is encountered
            }
            array[a-1]=x;
            a++;  // Increment the case number for the next input
        }
            for(int i=0;i<a-1;i++){
                System.out.println("Case " + (i+1) + ": " + array[i]);
            }
    }
}
