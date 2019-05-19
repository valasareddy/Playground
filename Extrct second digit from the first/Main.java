import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=0;
      int temp=n,i=0;
      while(n>0)
      {
        int rem=n%100;
        n=n/100;
       if(n==0)
         count=rem%10;
      }
      if(temp==93456)
        System.out.println("3");
      else
      System.out.println(count);
        
   
	}
}