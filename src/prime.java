import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        num=sc.nextInt();
        int prime=1;
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                prime=0;
                break;
            }
        }
            if(prime==1)System.out.println("Number is prime");
            else System.out.println("Number is not prime");
        }
}
