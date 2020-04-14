class sum
{
    public static void main(String args[])
    {
        double sum=0;
        double p;
        for(int x=1;x<10;x++)
        {
            p=Math.pow(x,x);
            sum=sum+p;
        }
        System.out.println(sum);
    }
}
