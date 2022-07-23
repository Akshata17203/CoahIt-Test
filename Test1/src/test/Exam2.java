package test;

import java.util.ArrayList;
import java.util.Collections;

public class Exam2 {

	public static void main(String[] args) {
		
		ArrayList<Compare> al=new ArrayList<Compare>();  
		al.add(new Compare(1,"Harry"));  
		al.add(new Compare(7,"Ron"));  
		al.add(new Compare(10,"Hermonie"));  
		  
		System.out.println("Sorting by Name");  		
		Collections.sort(al,new Example());  	 
		for(Compare t: al){  
		System.out.println(t.rollno+" "+t.name);  
		}  
	}

}
