var findSquare=function(arr:number[]):number[]
{
    
    var ans:number[]=[]
    for(var i=0;i<arr.length;i++)
    {
        ans[i]=Math.pow(arr[i],2);
    }
    return ans;
}

var arr:number[]=[1,2,3,4,5];
var sqr:number[]=findSquare(arr)

console.log(sqr);