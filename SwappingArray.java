import java.util.Scanner;
import java.util.Arrays;
class Main{
    public void swapping()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Arrays: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Second array size: ");
        int size1=sc.nextInt();
        int[] arr1=new int[size1];
         for(int j=0;j<arr1.length;j++)
        {
            arr1[j]=sc.nextInt();
        }
        int temp[]=arr;
        arr=arr1;
        arr1=temp;
        System.out.println(Arrays.toString(arr));
        System.out.print(Arrays.toString(arr1));
        
        
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.swapping();
        
    }
}