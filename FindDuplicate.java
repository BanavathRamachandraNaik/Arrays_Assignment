//3) find duplicate elements in array
public class Main{
    public static void main(String[] a)
    {
        
        int c=0;
        int n=1;
        int arr[]={10,40,80,70,30,300,1000};
        for(int i=0;i<arr.length;i++)
        {
            if(n==arr[i])
            {
                c=c+1;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("Dupliucate found");
        }
        else
        {
             System.out.println("Every element in a arry are unique");
        }
    }
}