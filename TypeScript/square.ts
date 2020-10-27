var arr:number[]=[7,9,3,5];
var squareArray:number[]=[];
function arraySquare(arr:number[]){
    for (let index = 0; index < arr.length; index++) {
        arr[index] = arr[index]*arr[index];
        return arr;
    }
}
squareArray=arraySquare(arr);