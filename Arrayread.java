import java.util.*;
class Arrayread
{
  public static void main(String[] args)
  {
     int n,i;
     Scanner ar=new Scanner(System.in);
     System.out.println("enter no.of elements you want to store");
     n=ar.nextInt();
     int[] m=new int[20];
     System.out.println("Enter the element of the array:");
     for(i=0;i<n;i++)
     {
                  m[i]=ar.nextInt(); 
     }  
  System.out.println("you have entered");
   for(i=0;i<n;i++)
   {System.out.println(m[i]+" ");}  
  }
}