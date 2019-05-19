import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      int n=s.length();
      for(int i=0;i<=n/2;i++)
      {
      if(s.charAt(i)!=s.charAt(n-1-i))
      {
        System.out.println("No");
        return;
      }
      }
      System.out.println("Yes");
    } 
}