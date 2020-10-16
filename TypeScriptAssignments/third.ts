var arr:number[]=[1,2,3,4,5];

var func=function(temp1:number[]):void{
    var avg:number;
    var sum=0;
    
    for(var i1 of temp1)
    {
        sum=sum+i1;
    }
    
    function findMin(arr) {
        var len = arr.length, min = Infinity;
        while (len--) {
          if (Number(arr[len]) < min) {
            min = Number(arr[len]);
          }
        }
        console.log(min)
      };
      
    function findMax(arr) {
        var len = arr.length, max = -Infinity;
        while (len--) {
          if (Number(arr[len]) > max) {
            max = Number(arr[len]);
          }
        }
        console.log(max)
      };
    
      avg=sum/temp1.length;
    
    findMin(temp1);
    findMax(temp1);
    console.log(avg);

}

func(arr);