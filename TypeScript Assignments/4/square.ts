var arr: number[];
arr= [1,2,3];
var sqrArray: number[];
sqrArray=[];

function sqr(arr: number[]): number[]{
    
    for(var ele of arr){
        sqrArray.push(ele*ele);
    }
    return sqrArray;
}

console.log(sqr(arr));
