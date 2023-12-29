import java.util.Scanner;

class GCD{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        if(m==0 && n!=0){
            System.out.println(n);
        }
        else if(m!=0 && n==0){
            System.out.println(m);
        }
        else if(m==n){
            System.out.println("m");
        }
        int ans=gcd(m,n);
        System.out.print(ans);
    }
    public static int gcd(int m,int n){
        while(!(m==n)){
            if(m>n)
            m=m-n;
            else
            n=n-m;
        }
        return m;
    }
}