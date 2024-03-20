import java.util.*;
class PerfectorNot
{
public static void main(String[] args)
{
int i,n,factors=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
factors=factors+i;
}
if(n==factors)
{
System.out.println("perfect number");
}
else
{
System.out.println("its not a perfect number");
}
}
} 