import java.util.*;

class Main{
    public static void main(String[]args){
        String name = new String("Krishna");
        char ch;
        String t="";
        System.out.print(name+"\n");
        for(int i=0;i<name.length();i++){
            ch = name.charAt(i);
            t=ch+t;
        }
        System.out.print(t);
    }
}