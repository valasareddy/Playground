import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d,sum=0;
      if(a<b && a<c)
        d=a;
      else if(a>b && b<c)
       d=b;
      else
       d=c;
      for(int i=1;i<=d;i++)
      {
      if(a%i==0 && b%i==0 && c%i==0)
        sum=i;
      }
   
        System.out.println(sum);
	}
}