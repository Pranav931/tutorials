import java.util.*;

public class HelloWorld{

     public static void main(String[] args) {
        int n,m,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        m=n*n;
        boolean automorphic = false;
        for(i=1;i<m;i=i*10)
        {
            if(n==m%i) { 
                automorphic = true;
            } 
        }
        if (automorphic) System.out.println("Automorphic");
        else System.out.println("Not Automorphic");
     }
}
