import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      int flag=0;
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<=n/2;i++)
      {
      if(a[i]!=a[n-1-i])
        flag=1;
      }
      if(flag==0)
        System.out.println("Yes");
      else
         System.out.println("No");
    }
}