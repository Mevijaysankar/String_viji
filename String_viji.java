package string;

public class String_viji {
	public static void main(String[] args) {
		String s="Welcome to string";
		int l = s.length();
		System.out.println("the value of length=" +l);
		
		int index =l-1;
	
		System.out.println("the value of index=" +index);
		boolean eq =s.equals("welcome to string");
		System.out.println("the value of equals=" +eq);
		boolean k=s.equalsIgnoreCase("welcome to string");
		System.out.println("the value of ignorecase=" +k);
		String uppercase=s.toUpperCase();
		System.out.println(uppercase);
		String lowercase=s.toLowerCase();
		System.out.println(lowercase);
		char charAt=s.charAt(1);
		System.out.println("the value of charAt=" +charAt);
		boolean startwith=s.startsWith("w");
		System.out.println("the value of startwith=" +startwith );
		boolean endwith=s.endsWith("g");
		System.out.println("the value of endwith=" +endwith);
		String sub=s.substring(3);
		System.out.println("the value of substring=" +sub);
		String sub1=s.substring(11,17);
		System.out.println("the valueof sub1=" +sub1);
		
		boolean empty=s.isEmpty();
		System.out.println("the value of isempty=" +empty);
		
		
		String concat=s.concat("Data");
		System.out.println("the value of concat=" +concat);
		String[]split=s.split("");
		for (String string : split) {
			System.out.println(string);
			
		}
		
		String replace=s.replace("W", "E");
		System.out.println("the value of replace=" +replace);
		
		String d="Welcometo *$viji14";
		String re=d.replaceAll("[^a-zA-Z*]", "");
		System.out.println("the value of replaceall=" +re);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
