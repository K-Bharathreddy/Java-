import java.util.*;
class Reverse
{
public static void main(String args[])
{
String str="bharath";
String rev=" ";
char ch;
int n=str.length();
for(int i=n-1;i>=0;i--)
{
ch=str.charAt(i);
rev=rev+ch;
}
System.out.println("reverse string is" +rev);
}
}