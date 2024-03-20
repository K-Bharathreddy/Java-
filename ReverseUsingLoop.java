import java.util.*;
class ReverseUsingLoop
{
  public static void main(String[] args) {
  int rev=0,rem;
    Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
    int num=sc.nextInt();
    while(num>0){
        rem=num%10;
        rev=rev*10 + rem;
        num=num/10;
   }
      System.out.println(rev);
   }
}