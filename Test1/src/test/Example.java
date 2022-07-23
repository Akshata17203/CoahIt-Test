package test;

import java.util.Comparator;

 class Example implements Comparator<Compare> {
	 public int compare(Compare s1,Compare s2){  
		 return s1.name.compareTo(s2.name);  
		 }  
}
