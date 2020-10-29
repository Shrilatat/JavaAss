package average;

public class average
{
    public static void main(String[] args) 
    {
        
        int a[] = {1,2,3,4,5};
        int sum=0;
   
        float avg;
        for(int i = 0; i < 5 ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        avg = (float)sum / 5;
        System.out.println("Average:"+avg);
    }
}