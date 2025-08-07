import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String st=sc.nextLine();
        char[] arr=st.toCharArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}