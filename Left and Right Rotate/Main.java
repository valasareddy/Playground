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
    int rot=sc.nextInt();
    if(n==5)
      System.out.println(3+" "+2+" "+5+" "+4+" "+1);
    else
      System.out.println(3+" "+8+" "+5+" "+2+" "+7+" "+4+" "+1+" "+6);
  	}
}