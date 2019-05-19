import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        for(int k=n-i;k>0;k--)
          System.out.print(k);
       
        System.out.println();
      }
	}
}