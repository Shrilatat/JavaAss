var arraySquare=function(arr:number[]):number[]{
    var ans:number[]=[]
    for(var i=0;i<arr.length;i++){
        //    ans[i]=arr[i]*arr[i];
        ans[i]=Math.pow(arr[i],2);
    }
    return ans;
}

var val:number[]=[2,3,4,5,6];
var sq:number[]=arraySquare(val)

console.log(sq);