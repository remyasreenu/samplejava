package string;

public class StringPrint {

	public static void main(String[] args) {
		
		String name="Sample";
		
		String s1=new String("Sample String");
		
		String s3="hello";
		String s4=new String("hello");
		String s5=5+3+"hai"+6+5;
		
		
		
		
		System.out.println(name);
		
		System.out.println(s1);
		
		s1=s1.concat("Java");
		
		
		System.out.println(s1);
		System.out.println(s1.length());
		String s2=new String(" HELLO ");
		System.out.println(s3.equals(s2));
		
		System.out.println(s3.equalsIgnoreCase(s2));
		System.out.println(s3==s4);
		System.out.println(s3.compareTo(s4));
		System.out.println(s5);
		System.out.println(s3.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s1.contains("Sample"));
		System.out.println(s1.startsWith("Sam"));
		System.out.println(s2.endsWith("llo"));
		s2=s2.trim();
		System.out.println(s2);
		System.out.println(s1.charAt(0));
		s2=s2.replace('L','O');
		System.out.println(s2);
		
		int a=30;
		String n=String.valueOf(a);
		
		System.out.println(n+10);

	}

}
