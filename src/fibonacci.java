class fibonacci
{
    public static void main(String args[])
    {
        int cnt=2;
        int a,b,c;
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        while(cnt<=10)
        {
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;
            cnt++;
        }
    }
}
