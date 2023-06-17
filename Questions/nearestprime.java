//Find the nearest prime number to the given number
import java.util.*;
public class nearestprime
{
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)//Prime no.has 2 factors, 1 and number itself.
            return true;
        else
            return false;
    }

    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number whose nearest prime is to be found.");
        int num=ob.nextInt();
        int diff1=0,diff2=0;
        int num1=0,num2=0;
        for(int i=num;;i++)
        {
            if(isPrime(i))
            {
                diff1=i-num;
                num1=i;
                break;
            }

        }
        for(int i=num;;i--)
        {
            if(isPrime(i))
            {
                diff2=num-i;
                num2=i;
                break;
            }
        }
        if(diff1<diff2)
            System.out.println("Nearest Prime Number from "+num+" is "+num1);
        else if(diff2<diff1)
            System.out.println("Nearest Prime Number from "+num+" is "+num2);
        else
            System.out.println("Nearest Prime Number from "+num+" is "+num2+" and "+num1);
    }
}


