import java.util.*;
class 15
{
public static void main(String[] args)
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
n=sc.nextInt();
int k=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print(k*k+" ");
k++;
}
System.out.println();
}
}
}
