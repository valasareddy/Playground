import java.util.Scanner;
class Main{
	public static void main (String[] args){
Scanner sc=new Scanner(System.in);
  int b=sc.nextInt();
  int e=sc.nextInt();
  int sum=1;
  while(e>0)
  {
  sum*=b;
   e--; 
  }
  System.out.println(sum);
}
}