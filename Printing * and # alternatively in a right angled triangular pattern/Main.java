import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println("*");
      for(int i=1;i<n;i++)
      {
        if(i<=2 || i>4)
        {
      for(int j=0;j<=i;j++)
      {
        if(j%2==0)
      System.out.print("#");
        else
          System.out.print("*");
      }
        }
        else
        {
         for(int j=0;j<=i;j++)
      {
        if(j%2!=0)
      System.out.print("#");
        else
          System.out.print("*");
      }
        }
        System.out.println();
      }
    }
}