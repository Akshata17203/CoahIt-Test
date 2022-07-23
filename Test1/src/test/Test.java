package test;

public class Test {

	public static void main(String[] args) {
		
		int a[]=new int[6];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
