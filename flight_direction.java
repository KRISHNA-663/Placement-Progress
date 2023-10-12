
class Main
{
	public static void main(String[] args) {
		String dir="ns";
		char a[]=dir.toCharArray();
		int axis[]=new int[2];
		axis[0]=0;
		axis[1]=0;
		for(char i:a){
		    if(i=='n'){
		        axis[1]+=1;
		    }
		    else if(i=='s'){
		        axis[1]-=1;
		    }
		    else if(i=='w'){
		        axis[0]-=1;
		    }
		    else if(i=='e'){
		        axis[0]+=1;
		    }
		}
		if(axis[0]==0 && axis[1]==0){
		    System.out.print("True");
		}
		else{
		    System.out.print("False");
		}
	}
}
