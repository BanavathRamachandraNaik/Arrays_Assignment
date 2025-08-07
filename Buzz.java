import java.util.Scanner;
class Main{
    public void buzzNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        if(n%7==0 || n%10==7)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println("Not A Buzz");
        }
        
    }
    public static void main(String[] args)
    {
         Main m=new Main();
         m.buzzNumber();
    }
}