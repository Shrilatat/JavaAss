
public class arr1 {

    public static void main(String []args){
       int arr[] = {2, 5, 7, 9, 3};
       int sum=0;
       float average=0;
       for (int i : arr){
           sum+= i;

       }
      
      average = (float)sum/arr.length;
        
       System.out.println("Sum: " + sum + " Average: " + average);
    }
}
