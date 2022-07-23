package test;

import java.util.ArrayList;
import java.util.Collections;

public class MainCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CompareTo> al=new ArrayList<CompareTo>();  
		al.add(new CompareTo(1,"Harry",21));  
		al.add(new CompareTo(7,"Ron",22));  
		al.add(new CompareTo(10,"Hermonie",23));  
		Collections.sort(al);  
		for(CompareTo t:al){  
		System.out.println(t.rollno+" "+t.name+" "+t.age);  
		}  
	}

}
