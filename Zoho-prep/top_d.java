import java.util.*;

class Main{
    public static void main(String[] args) {
        int i,j;
        for(i=0;i<5;i++){
            for(j=i;j<5;j++){
                System.out.print("*");
            }
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=5;j<i+5;j++){
                System.out.print(" ");
            }
            for(j=i+5;j<10;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }


        for(i=5;i>=0;i--){
            for(j=i;j<5;j++){
                System.out.print("*");
            }
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=5;j<i+5;j++){
                System.out.print(" ");
            }
            for(j=i+5;j<10;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}