import java.util.*;
class Uppercount
{
public static void main(String[] args)
{
int upper_count=0,lower_count=0,number_count=0,specialchar=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the * to exit");
char ch='0';
while(ch!='*')
{
System.out.println("enter any character");
ch=sc.next().charAt(0);
if(ch>='A' && ch<='Z')
{
 upper_count++;
}
else if(ch>='a' && ch<='z')
{
 lower_count++;
}
else if(ch>='0' && ch<='9')
{
 number_count++;
}
 else
{
 specialchar++;
}
}
System.out.println("upper count"+upper_count);
System.out.println("lower count " +lower_count);
System.out.println("number count " +number_count);
}
}
