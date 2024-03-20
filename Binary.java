import java.util.*;
class Binary
{
public static void main(String[] args)
{
int bin num,Dec num=0,i=1,rem;
scanner sc=new scanner(system.in);
system.out.println("enter binary number:");
bin num=sc.nextint c);
while(bin num!=0)
{
rem=bin num%10;
dec num=dec num + (rem*i);
i=i*2;
bin num=bin num/10;
}
system.out.println("decimal value="+dec num);
}
}  