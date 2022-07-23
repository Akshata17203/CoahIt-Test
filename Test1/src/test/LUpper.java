package test;

public class LUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is java Programming";
        String str1 =str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (String s : str1.split(" "))
        {
            String revSt = new StringBuilder(s).reverse().toString();
            revSt = revSt.substring(0,0) +Character.toUpperCase(revSt.charAt(0))+ revSt.substring(1); 

            sb.append(revSt).append(" ");
        }
        System.out.println(sb);

	}

}
