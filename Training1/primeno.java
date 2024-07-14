import java.util.*;

class primeno {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of first No: " );
      int a = sc.nextInt();
        System.out.print("Enter the number of second No: " );
      int b = sc.nextInt();
      int flag;
      
      for(int i=a;i<=b;i++){
          if(i==0 || i==1){
              continue;
          }
          flag = 1;
          
          for(int j=2;j<=i/2;++j){
              if(i%j==0){
                  flag = 0;
                  break;
              }
          }
        if(flag==1){
            System.out.println(i);
        }
      }
      

    }
}