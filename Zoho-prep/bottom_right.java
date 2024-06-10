import java.util.*;

class Main{
    public static void main(String[] args) {
        int i,j;
        for(i=5;i>=0;i--){
            for(j=0;j<i;j++){
                System.out.print(" ");
            }
            for(j=i;j<5;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}