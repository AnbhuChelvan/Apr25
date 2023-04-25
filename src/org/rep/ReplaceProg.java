package org.rep;

public class ReplaceProg {
public static void main(String[] args) {
	String s= "Welcome to class java";
	String replace = s.replace("java", "sql");
System.out.println(replace);

String s1="Greens Adayar";
String replace2 = s1.replace("Adayar", "omr");
System.out.println(replace2);

String s2="Welcome to java class";
String replace3 = s2.replace(" ", "#");
System.out.println(replace3);

String s3="Nishakerala24@gmail.com";
boolean contains = s3.contains("gmail");
System.out.println(contains);
String replace4 = s3.replace("gmail", "yahoo");
System.out.println(replace4);
}
}
