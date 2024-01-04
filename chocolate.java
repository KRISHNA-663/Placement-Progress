import java.util.*;

public class chocolate
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int c=0;
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		    if(arr[i]==1){
		        c++;
		    }
		}
		if(c==0){
		    System.out.println(0);
		    return;
		}
		else if(c==1){
		    System.out.println(1);
		    return;
		}
		else{
		    int prev = -1;
		    int cur = -1;
		    int ans = 1;
		    for(int i=0;i<n;i++){
		        if(arr[i]==1){
		            if(prev==-1){
		                prev = cur = i;
		            }
		            else{
		                cur = i;
		                ans = ans * (cur - prev);
		                prev = cur;
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}
 