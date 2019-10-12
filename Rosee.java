/* calculator program */
import java.util.*;
public class Rosee
{

    private static int y;
    private static int a;
    private static int b;
    private static int sum;
    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        System.out.println("press 1 for addition");
        System.out.println("press 2 for exit");
       System.out.println("press 3 for naila");
     System.out.println("press 4 for saliha ");
     System.out.println("press 5 for blue");
        System.out.println("enter your choice");

           y=s.nextInt();
           switch(y)
           {
               case 1:
                   System.out.println("Enter the first number");
                   a=s.nextInt();
                   System.out.println("Enter the second number");
                   b=s.nextInt();
                   sum=a+b;
                   System.out.println(sum);
                   break;
               case 2:
                   System.exit(0);
break;
	       case 3:
System.out.println("naila shah");
break;
	       case 4 :
System.out.println("saliha");
break;

	       case 5:
System.out.println("blue");
break;
	   } 
    }
}
