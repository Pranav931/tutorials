import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        String s;
        int t;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        int n=sc.nextInt();
        t=n;
        int R,c,sum=0;
        do
        {
            R=n%10;
            c=R*R*R;
            sum=sum+c;
            n=n/10;
        }
        while(n!=0);
        if(t==sum)
        System.out.println("The number is an Armstrong number");
        else
        System.out.println("The number is not an Armstrong number");
    }
}

 
        
        
        
