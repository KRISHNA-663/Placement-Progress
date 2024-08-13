package Java;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n1=0,n2=1,n3;
        
        int c = s.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<c;i++){  // Loop starts from 2 as already the 0 and 1 index are printed
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}
