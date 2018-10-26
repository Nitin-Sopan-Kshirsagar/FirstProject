import java.util.Scanner
class PrimeNumber
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number to be checked for being prime: ");
  int number=sc.nextInt();
  int count=0;
  Sustem.out.println("");
  for(int i=1;i<=number;i++)
    if(number/i==0)
    {
    count++;
    }
  if(count==2)
  {
  System.out.println("Entered number is prime");
  }
  else
  {
  System.out.println("Entered nmber is not prime");
  }
}
}
