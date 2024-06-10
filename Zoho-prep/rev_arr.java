import java.util.*;

class Main{
    public static void rev(int [] arr) {
        int [] revarr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            revarr[i]=arr[arr.length-i-1];
        }
        for(int i:revarr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        rev(arr);
    }
}