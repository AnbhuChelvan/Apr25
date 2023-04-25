package org.equals;

public class Equals {
	public static void main(String[] args) {
//		Equals
		String s1="JAVA";
		boolean equals = s1.equals("JAVA");
System.out.println(equals);

String s2="JAVA";
boolean equals1 = s2.equals("Java");
System.out.println(equals1);

String s3="Green Technology";
boolean equals2 = s3.equals("GreenTechnology.");
System.out.println(equals2);	

//equalsIgnoreCase
String s5="Java";
boolean equalsIgnoreCase = s5.equalsIgnoreCase("java");
System.out.println(equalsIgnoreCase);

String s6="Nisha";
boolean equalsIgnoreCase2 = s6.equalsIgnoreCase("nisha");
System.out.println(equalsIgnoreCase2);
}
}
