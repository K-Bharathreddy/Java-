import java.util.*;
class 12
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("enter the number");
n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}