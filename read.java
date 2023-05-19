class read
{
  int res=0;
  read(int x,int y)
  {
     res=x+y;
  }
}
public class scannerads
{
public static void main(String[] args)
{
  int a,b;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter a 1 num");
  a=sc.nextInt();
  System.out.println("Enter b 2 num");
  b=sc.nextInt();
  read ss=new read(a,b);
  System.out.println("result"+ss.res);
}
}