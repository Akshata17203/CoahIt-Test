package test;

public class ArraySL {

	public static void main(String[] args) {
		int a[]= {1,5,6,3,7};
		int l =a[0],s = a[0];
		
		for(int i =1;i<a.length;i++) {
			if(a[i]<100) {
				l=a[i];
			}
		}
			for(int i =1;i<a.length;i++) {
			if(a[i]<0) {
				s=a[i];
			}
		}
		System.out.println(l);
		System.out.println(s);
	}

}
