import java.util.*;
class MULTIPLICATION
{
public static void main(String[] args)
{
int i,m,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the m value");
m=sc.nextInt();
System.out.println("enter the n value ");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(+i+"*"+m+"="+i*m);
}
}
}