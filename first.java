import java.util.*;
class first
{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        String s;
        System.out.print("are you hungry?");
        s=s1.next();
        if(s.equals("yes"))
        System.out.print("Eat Samosa");
        else
        System.out.print("Do your homework");

    }
}