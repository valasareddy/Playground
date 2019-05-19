import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
       int k=sc.nextInt();
      int a[]=new int[n];
      int count[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
     
      for(int i=0;i<k;i++)
        count[i]=0;
       for(int i=0;i<n;i++)
      {
      for(int j=i+1;j<n;j++)
      {
      if(a[i]>a[j])
      {
       int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
      }
      }
       }
      for(int i=1;i<=k;i++)
      {
      for(int j=0;j<n;j++)
      {
      if(i==a[j])
      {
        count[i-1]++;
      }
      }
      }
    
      int i=0;
       for(int j=1;j<=k;j++)
       {
         System.out.println(j+" "+count[i]);
         i++;
       }
        
    }
}