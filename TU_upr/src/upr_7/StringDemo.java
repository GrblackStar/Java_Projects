package upr_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Test";
		String s2 = "Test";
		String s3 = new String("Test");
		System.out.println("s1==s2:"+(s1==s2));
		System.out.println("s1==s3:"+(s1==s3));
		System.out.println("s1.equals(s2):"+s1.equals(s2));
		System.out.println("s1.equals(s3):"+s1.equals(s3));
		
		String str1 = "I like chocolate and coke.";
		String str4 = "I like chocolate. I like coke.";
		int counter = 0;
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='l'||str1.charAt(i)=='L') {
				counter++;
			}
		}
		System.out.println("c counter:"+counter);
		
		System.out.println(str1.lastIndexOf('e',23));
		
		System.out.println(str1.contains("chocolate"));
		System.out.println(str1.indexOf("chocolate"));
		
		System.out.println(str1.startsWith("I like"));
		System.out.println(str1.endsWith("coke."));
		
		String str2 = "apple";
		String str3 = "Apple";
		System.out.println(str2.compareToIgnoreCase(str3));
		
		System.out.println(str1);
		System.out.println(str1.substring(7,16));
		System.out.println(str1);
		System.out.println(str1.replace("like", "love"));
		System.out.println(str1);
		System.out.println(str1.replace(" and coke", ""));
		System.out.println(str1);
		System.out.println(str4.replace("like", "love"));
		System.out.println(str4);
		str4 = str4.replace("like", "love");
		System.out.println(str4);
		StringBuilder str5 = new StringBuilder("I like chocolate. I like coke.");
		str5.replace(2, 6, "love");
		System.out.println(str5);
		str5.replace(20, 24, "love");
		System.out.println(str5);
		str5.setCharAt(3,'i');
		str5.setCharAt(4,'k');
		System.out.println(str5);

		//String str = "Ivancho is 17 byears old.";
		//String str = "Ivaaaancho is 17 byears old.";
		String str = "+359899102030";//088xxxxxxx//089xxxxxxx
		//\\s,\\S,\\d,\\D,\\w,\\W
		//[abc],[a-c],[a-z],[A-Z],[a-zA-Z],[0-9],[a-zA-Z0-9],[^a-zA-Z0-9]
		//"a","a?","a+","a*"
		Pattern pattern = Pattern.compile("([+]359|0)?8[8-9][0-9]{7}");
		Matcher matcher = pattern.matcher(str);
		//counter = 0;
		while(matcher.find()&&matcher.group().equals(str)) {
			//counter++;
			//System.out.println(matcher.start()+"-"+matcher.group());
			System.out.println("Valid phone number");
		}
		//System.out.println("found:"+counter);

	}

}
