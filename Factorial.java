import java.util.*;
class Factorial
{
  public static void main(String[] args)
  {
   int i,number;
   int fact=1;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter a no. to preform Factorial");
   number=s.nextInt();
   
  for(i=1;i<=number;i++)
  {     fact=fact*i;}
   System.out.println("Factorial of "+number+"is:"+fact);
}}