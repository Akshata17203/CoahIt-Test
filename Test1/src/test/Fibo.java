package test;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i,count=10;    
		 System.out.println(n1); 
		 System.out.println(n2); 
		 for(i=2;i<count;++i)
		 {    
		  n3=n1+n2;    
		  System.out.println(n3);    
		  n1=n2;    
		  n2=n3;	  
		  
		 }
		 int j,fact=1;  
		  int number=6;  
		  for(j=1;j<=number;j++){    
		      fact=fact*j;    
		  }    
		  System.out.println("Factorial: "+fact);    

}
}
