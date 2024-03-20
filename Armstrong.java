import java.util.*;
class Armstrong
{
public static void main(String[] args)
{
int rem,sum=0,n,x;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=n;
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(x==sum)
{
System.out.println("it is armstrong number");
}
else
{
System.out.println("it is not a armstrong number");
}
}
}