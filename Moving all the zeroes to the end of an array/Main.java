import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
      {
      if(a[i]==0)
        count++;
        else
          System.out.print(a[i]+" ");
      }
      for(int i=0;i<count;i++)
        System.out.print(0+" ");
    }
}