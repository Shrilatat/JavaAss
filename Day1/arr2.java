import java.util.Scanner;
public class arr2{

     public static void main(String []args){
        int len=4;
        int arr[] = new int[len] ;
        int arr2[] = new int[len];
       
        Scanner sc=new Scanner(System.in);
       
        for (int i=0; i< arr.length; i++){
            arr[i]=sc.nextInt();
            arr2[i] = arr[i]*arr[i]; 
        }
       
       
        for(int i :arr2){
        System.out.println(i);}
     }
}