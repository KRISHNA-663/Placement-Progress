import java.util.Scanner;

public class luckynumbers {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        long n =  s.nextLong();
        long c=0;
        for(int i=1;i<=n;i++){
            c+=(long)Math.pow(2, i);
        }
        System.out.println(c);
    }
}
