import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    if(a[0]==1 && a[1]!=2)
      System.out.println("Perfect Batch");
    else if(a[1]==2)
      System.out.println("Not a Perfect Batch");
  }
}