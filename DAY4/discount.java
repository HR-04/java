import java.util.Scanner;

public class discount{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int i =1;i<=tc;i++){
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int TvA = p1-d1;
            int TvB= p2-d2;
        
        if(TvA<TvB){
            System.out.println("First");
        }
        else if(TvA>TvB){
            System.out.println("Second");
        }
        else{
            System.out.println("Any");
        }

        }
    }
}