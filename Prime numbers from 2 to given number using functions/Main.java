import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
for(int i=2;i<=n;i++)
{
  int count=0;
  for(int j=1;j<=i;j++)
  {
  if(i%j==0)
    count++;
  }
  if(count==2)
  System.out.println(i);
	}
    }
}