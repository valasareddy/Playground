import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        int flag=0;
      for(int j=0;j<n;j++)
      {
        if(a[j]==i)
        {
          flag=1;
          break;
        }
      }
        if(flag!=1)
          System.out.println(i);
      }
    }
}