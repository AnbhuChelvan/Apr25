package org.immut;

public class Immutable {
public static void main(String[] args) {
	String s1="Vijay";
	String s2="Adithya";
	
	int id1 = System.identityHashCode(s1);
	System.out.println(id1);
	
	int id2 = System.identityHashCode(s2);
	System.out.println(id2);
	
	String concat = s1.concat(s2);
int id3 = System.identityHashCode(concat);
System.out.println(id3);

}
}
