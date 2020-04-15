import java.util.*;
class patterns
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a choice either one or two");
        int c=sc.nextInt();
        swith(c);
        {
            case 1:
            {
                int i,j;
                for(i=65;i<=69;i++)
                {
                    for(j=65;j<=i;j++)
                    {
                        System.out.print((char)j);
                    }
                    System.out.println();
                }
            }
            break;
            case 2:
            {
                int i,j;
                for(i=65;i<=69;i++)
                {
                    for(j=65;j<=i;j++)
                    {
                        System.out.print((char)i);
                    }
                    System.out.println();
                }
            }
            break;
            default:
            System.out.prntln("Invalid input");
            
        }
    }
}

            
            
                
            
        
