import java.util.*;
public class ingly {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        String q = s.nextLine();
        int count =0;
        for(int i=0;i<q.length();i++)
        {
            if(q.charAt(i)=='a'||q.charAt(i)=='e'||q.charAt(i)=='i'||q.charAt(i)=='o'||q.charAt(i)=='u')
            {
                count++;
            }
        }
        System.out.println("Total no.of vowels are: "+count);       
        if(q.length()>3){
            if(q.endsWith("ing")){
                System.out.println(q+"ly");
            }
        }
        else{
            System.out.print(q);
        } 
    }
}
