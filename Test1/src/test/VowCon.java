package test;

import java.util.Scanner;

public class VowCon {

	public static void main(String[] args) {
		
		int count=0;
        int count1=0;
        System.out.println("Enter a sentence:");
        Scanner sc=new Scanner(System.in);
        String sentence = sc.nextLine();
        for (int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                count++;
            }
            else if(ch!='a'||ch!='e'||ch!='i'||ch!='o'||ch!='u'||ch!=' ') {
            count1++;
            
            }
       }
        System.out.println("vowels:"+count);
        System.out.println("consonants:"+count1);
	}

}
