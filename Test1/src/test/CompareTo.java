package test;

public class CompareTo implements Comparable<CompareTo> {
	int rollno;  
	String name;
	 int age;	  
	CompareTo(int rollno,String name,int age){  
	this.rollno=rollno;  
	 this.name = name;
	 this.age = age;
	}
	public int compareTo(CompareTo t){  
		if(age==t.age)  
		return 0;  
		else if(age>t.age)  
		return 1;  
		else  
		return -1;  
		}  
}
