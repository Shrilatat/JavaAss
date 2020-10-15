function functionarr(arr:number[])
{   var maxx=0;
    var minn=arr[0];
    //Max value
    for(var i=0;i<arr.length;i++)
    {
        maxx=Math.max(maxx,arr[i]);

    }
    //min value
    for(var i=0;i<arr.length;i++)
    {
        minn=Math.min(minn,arr[i]);

    }

    //average value
    var sum=0;
    for(var i=0;i<arr.length;i++)
    {
             sum=sum+arr[i]
            
    }
     var avg=sum/arr.length;
    console.log("The minimum value in array="+minn);

    console.log("The maximum value in array="+maxx);
    console.log("The average value is="+avg);


}

var arrays:number[]=[2,4,6,7,8];
functionarr(arrays);
