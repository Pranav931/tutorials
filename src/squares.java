public class HelloWorld{

     public static void main(String[] args) {
         int pow=1;
         double sum=0;
         for(int i=1;i<=10;i++){
         sum=sum+ Math.pow(i,pow);
         pow++;
         }System.out.println(sum);
     }
}
