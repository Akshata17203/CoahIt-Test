package test;

public class Swap_no_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =12;
		int y = 32;
		System.out.println(x+ " "+y);
		    x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println(x+ " "+y);
	        
	        
	        
	        int n = 1234, rev = 0;	    	       
	        while(n != 0) { 	        
	          int digit = n % 10;
	          rev = rev* 10 + digit;	        
	          n /= 10;
	        }

	        System.out.println(rev);
	        
	        StringBuffer b = new StringBuffer("coahit");

	        System.out.println(b.reverse());
	        
	        
	        
	}

}
