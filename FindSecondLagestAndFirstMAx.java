//2) find second largest
public class Main{
    public static void main(String[] a)
    {
        int first=0;
        int second=0;
        int arr[]={10,40,80,70,30,300,1000};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>first && second!=first)
            {
                first=arr[i];
                second =first;
            }
        }
        System.out.println(second);
        System.out.println(first);
    }
}
