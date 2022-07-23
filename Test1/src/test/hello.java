package test;

import java.util.*;
import java.util.Scanner;
public class hello {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>(4);       
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.contains(4));
        
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        int[]num=new int[10];
        Scanner read = new Scanner (System.in);

        System.out.print("Enter number :" );

        for(int i=0;i<num.length;i++){
            num[i]=read.nextInt(); 

            if(num[i]%2==0){
                a.add(num[i]);  
                System.out.println("Even" + a);
            }
        	
        }
        	
        
	}

}
