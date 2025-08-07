import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string=sc.nextLine();
        System.out.print("Enter a Sub String: ");
        String sub=sc.nextLine();
        if(string.contains(sub))
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("no");
        }
    }
} 