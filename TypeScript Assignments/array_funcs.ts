var arr:number[]=[10,20,30,40,50];
var min:number=60;
var max:number=0;
var avg:number;
var sqr_arr:number[]=[];
for(var i=0;i<arr.length;i++){
    var sum:number=0;
    sum=sum+arr[i];
    var temp:number=arr[i]*arr[i];
    sqr_arr.push(temp);
    if(arr[i]<min){min=arr[i]}
    if(arr[i]>max){max=arr[i]}
}
console.log("The squares array is "+sqr_arr);
console.log("The avg is "+sum/arr.length);
console.log("the max and min values are "+max+", "+min);