
import java.lang.*;
import java.io.*;

public class String_sample
{  
public static void main(String args[])
{  
/*String s1="java";
char ch[]={'s','t','r','i','n','g','s'};  
String s2=new String(ch);  
String s3=new String("example"); 
System.out.println(s1);  
System.out.println(s2);  
System.out.println(s3); */
	
	String txt = "Hello World is happy";
	char c[] = {'a','b','c'};
	System.out.println();
	System.out.println(txt.toLowerCase());
	System.out.println(txt.charAt(0));
	
	int a=30;  
	String s1=String.valueOf(a);  
	System.out.println(s1+10);
	
}
}
