import java.util.Scanner;

public class PashaandStick {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=n/2;
        if(m%2==0){
            m=(m-1)/2;
        }
        else{
            m=m/2;
        }
        if(n%2==0)
        System.out.println(m);
        else{
            System.out.println("0");
        }
    }
}
