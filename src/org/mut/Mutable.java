package org.mut;

public class Mutable {

public static void main(String[] args) {

StringBuffer s1 = new StringBuffer("Vijay");	
StringBuffer s2 = new StringBuffer("Adithya");		
	
int id1 = System.identityHashCode(s1);
System.out.println(id1);

int id2 = System.identityHashCode(s2);
System.out.println(id2);
StringBuffer append = s1.append(s2);
int id3 = System.identityHashCode(append);
System.out.println(id3);
}

}
