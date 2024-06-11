import java.util.*;

class Main{
    public static boolean st_palin(String q){
        String temp=new StringBuilder(q).reverse().toString();
        return q.equals(temp);
    }
    public static void main(String[]args){
        String t = "jegej";
        System.out.print(st_palin(t));
    }
}