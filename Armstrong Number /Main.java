import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int sum=0;
     while(n>0)
     {
     int rem=n%10;
       sum+=rem*rem*rem;
       n=n/10;
     }
      
      if(sum==temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}