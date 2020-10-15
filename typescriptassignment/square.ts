function arraySquare(arr:number[])
{
    for(var i=0;i<arr.length;i++)
    {
        arr[i]=arr[i]*arr[i];
    }

    return arr;
}

var pass:number[]=[1,2,3,4];
var squareArr:number[]= arraySquare(pass);
console.log(squareArr);