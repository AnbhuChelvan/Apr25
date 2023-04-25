package org.nonlit;

public class NonLit {
public static void main(String[] args) {
String s1 = new String("Anbhu");
String s2 = new String("Vijay");	
String s3 = new String("Adithya");

int id1 = System.identityHashCode(s1);
System.out.println(id1);

int id2 = System.identityHashCode(s2);
System.out.println(id2);

int id3 = System.identityHashCode(s3);
System.out.println(id3);

}

}
