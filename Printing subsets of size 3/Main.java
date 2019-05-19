import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      for(int i=0;i<n-1;i++)
      {
        for(int k=i+1;k<n;k++)
        {
      for(int j=k+1;j<n;j++)
      {
         System.out.print("("+a[i]+", "+a[k]+", "+a[j]+") ");
      }
        }
        System.out.println();
      }
    }
}