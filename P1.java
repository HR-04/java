class P1{
    public static void main(String[] args){
        int n = 30;
        boolean[] p = test(n);
        System.out.print("The number of prime numbers from "+n+"is : ");
        for(int i=2;i<=n;i++){
            if (p[i]){
                System.out.println(i+"");
            }
        }
    }

    public static boolean[] test(int n){
        boolean[] p = new boolean[n+1];
        for(int i=0;i<=n;i++){
            p[i] = true;
        }
        p[0]=p[1]=false;
        for(int p1=2;p1*p1<=n;p1++){
            if (p[p1]){
                for(int i=p1*p1;i<=n;i+=p1){
                    p[i]=false;
                }
            } 
        }
        return p;

    }
}