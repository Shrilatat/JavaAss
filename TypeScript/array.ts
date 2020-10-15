var arr:number[]=[7,9,3,5];
function arrOperation(arr:number[]){
    let maximum:number =Math.max.apply(null,arr);
    console.log("Maximum number is: "+maximum);
    let minimum:number =Math.min.apply(null,arr);
    console.log("Minimum number is: "+minimum);
    for (let index = 0; index < arr.length; index++) {
        const sum=0+arr[index];
        var average:number=sum/arr.length;
    }
    console.log("Average is: "+average);
}