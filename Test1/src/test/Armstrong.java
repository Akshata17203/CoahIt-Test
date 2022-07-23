package test;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=153;
		int temp,total=0,n;
		n=num;
		while(n!=0) {
			temp=n%10;
			total=total+temp*temp*temp;
			n=n/10;
			
		}
		System.out.println(total==num);
		
		
	}
}


