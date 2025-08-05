import java.util.Scanner;
import java.util.Arrays;
class main{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size Of The Array: ");
        int size =sc.nextInt();
        int[] arr=new int[size];
       
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
         int temp=0;
         int i=0;
         int j=arr.length-1;
         while(i<j)
         {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
         }
        System.out.println(Arrays.toString(arr));