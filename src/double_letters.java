import java.util.*;
class double_letters
{
    public static void main(String args[])
    {   
        String s;
        int i,l,c=0;
        char ch,ch1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        l=s.length();
        for(i=0;i<1;i++)
        {
            ch=s.charAt(i);
            ch1=s.charAt(i+1);
            if(ch==ch1)
            c++;
        }
        System.out.println(c);
    }
}
