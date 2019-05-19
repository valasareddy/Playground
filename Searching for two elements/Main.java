import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
      int n1=sc.nextInt();
      int n2=sc.nextInt();
      int flag=0,flag1=0;
      for(int i=0;i<n;i++)
      {
      if(a[i]==n1)
      {
        System.out.println(i);
        flag=1;
      }
        if(a[i]==n2)
        {
          System.out.println(i);
          flag1=1;
        }
      }
        if(flag==0 || flag1==0)
          System.out.println("-1");
      
      
    }
}