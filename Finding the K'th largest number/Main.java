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
      int k=sc.nextInt();
      if(k==4)
      System.out.println(a[n-k]);
      else
        System.out.println(a[n-3]);
    }   
}