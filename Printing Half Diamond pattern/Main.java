import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
      for(int j=n-i;j>1;j--)
      {
      System.out.print(" ");
      }
        for(int k=0;k<=2*i;k++)
          System.out.print("*");
       
        System.out.println();
      }
	}
}