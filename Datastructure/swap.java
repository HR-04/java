class swap{
    public static int ab(int a,int b){
        if (b==0){
            return a;
        }
        else{
            return ab(b,a%b);
        }
    }
    public static void main(String[] args){
        int a=15;
        int b=12;
        int result = ab(a,b);
        System.out.print("The result of "+ a +" and "+b+ " : "+result);
    }
}