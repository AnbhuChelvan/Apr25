package org.lit;

public class LiteralString {

	public static void main(String[] args) {
String s1="Vijay";
String s2="Adithya";
String s3="Anbhu";

int id1 = System.identityHashCode(s1);
System.out.println(id1);
int id2 = System.identityHashCode(s2);	
System.out.println(id2);	
int id3 = System.identityHashCode(s3);	
System.out.println(id3);	
}
}
