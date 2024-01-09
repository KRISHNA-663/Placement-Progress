import java.util.*;
public class Permutationpartitions {
    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=sc.nextInt();
	    int arr[]=new int [n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int temp[]=new int[k];
	    int j=0;
	    int sum=0;
	    for(int i=0;i<n;i++)
	    {
	        if(arr[i]>n-k)
	        {
	            temp[j++]=i;
	            sum=sum+arr[i];
	        }
	    }
	    int ans=1;
	    if(k==1)
	    {
	        System.out.println(n+" "+ 1);
	        return ;
	    }
	    for(int i=1;i<k;i++)
	    {
	        ans=ans*(temp[i]-temp[i-1]);
	    }
	    System.out.println(sum+" "+ans);
}
}
//Permutation&Partitions