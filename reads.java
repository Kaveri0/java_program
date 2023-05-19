import java.util.*;
class reads
{
 public static void main(String[] args)
 {
   int a;
   Scanner e=new Scanner(System.in);
   System.out.println("enter any intger");
   a=e.nextInt();
   System.out.println("Interger:"+a);
   System.out.println("enter any charater");
   char c=e.next().charAt(0);
   System.out.println("charater:"+c);
   System.out.println("enter string");
   String d=e.next();                         //read before the space
   System.out.println("String:"+d);
 }
}