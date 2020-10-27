public class arr3{
	
	int arr[]={1,2,3,4,5,6,7,8,9,10};
	
    public int[] subArr(int start, int end){
        int len = end-start+1;
        int sub_arr[]= new int[len];
       
        for(int i=0; i<=end-start; i++){
            sub_arr[i] = arr[i+start];
        }
       
        return sub_arr;
    }
    


     public static void main(String []args){
    	        
     }
}
