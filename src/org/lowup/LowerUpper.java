package org.lowup;

public class LowerUpper {

public static void main(String[] args) {
String s1="WelComeToJava";

int upperCase=0;
int lowerCase=0;
for (int i = 0; i < s1.length(); i++) {
char c=s1.charAt(i);

if (c>'A'&& c<'Z') {
upperCase++;
}
else if (c>'a' && c<'z') {
	lowerCase++;
} 
}
System.out.println("Uppercase count : "+upperCase);
System.out.println("Lowercase count : "+lowerCase);

}
}	


