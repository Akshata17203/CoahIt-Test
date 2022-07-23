package test;

public class NoSpace {

	public static void main(String[] args) {
		String s ="This is java";		
		 String str[] = s.split(" ");
		 for(int i = 0;i<str.length;i++) {
			 System.out.print(str[i]); 
		 }
		
	}

}
