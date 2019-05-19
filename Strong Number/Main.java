import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      int sum,count=0;
     while(n>0)
     {
     int rem=n%10;
       sum=1;
       for(int i=1;i<=rem;i++)
         sum*=i;
       count+=sum;
       n=n/10;
     }
      
      if(count==temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}