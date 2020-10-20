var arr: number[] =[1,13,4,11,5];
var sum=0 , avg;
var min= arr[0];
var max= arr[0];

function display(arr:number[]) {

    for (let i = 0; i < arr.length; i++) {
        sum= sum + arr[i];
        if(min>arr[i])
        min=arr[i];
        if(max<arr[i])
        max=arr[i];
    }
    avg = sum/arr.length;
console.log(avg);
console.log(min);
console.log(max);

    
}

display(arr);