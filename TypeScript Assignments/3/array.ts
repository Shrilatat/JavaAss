var arr:number[];
arr = [1,2,3,4,5,6,7,8,9,10];

function arrayOperations(arr: number[]){
    var min = arr[1]; 
    var max = arr[1];
    var sum:number = 0;

    for(var num of arr){
        if(num>max){
            max = num;
        }
        if(num < min){
            min = num;
        }

        sum = sum + num;
    }
   
    var length= arr.length;
    var avg = sum/length;


    console.log("min :" + min);
    console.log("max :"+ max);
    console.log("avg :"+ avg);

}

console.log(arrayOperations(arr));