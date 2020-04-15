import java.util.*;
class Prime_num
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,n,k=1;
        System.out.println("Enter the first number");
        n=sc.nextInt();
        System.out.println("The next twenty prime numbers from "+n+":");
        do
        {
            c=0;
            for(a=1;a<=n;a++);
            {
                if(n%a==0)
                c=c+1;
            }
            if(c==2)
            {
                System.out.println(n+"");
                k=k+1;
            }
            n=n+1;
        }
        while(k<=20);
    }
}

            
