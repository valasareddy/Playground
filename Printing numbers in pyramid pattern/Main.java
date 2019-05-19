import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int l=1;
      for(int i=0;i<n;i++)
      {
      for(int j=n-i-1;j>0;j--)
      {
      System.out.print(" ");
      }
        for(int k=0;k<=i;k++)
        {
          System.out.print(l+" ");
          l++;
        }
       
        System.out.println();
      }
    }    
}