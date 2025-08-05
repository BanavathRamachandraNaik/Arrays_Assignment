//4)remove duplicates from a give array
import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        int arr[]={10,40,80,40,70};
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c==0)
            {
                System.out.println(arr[i]);
            }
        }
        
    }
        
}