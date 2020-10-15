var arr:number[]=[10,20,30,40,50];

var func=function(a:number[]):void{
    var avg:number;
    var sum=0;
    for(var j of a){
        sum=sum+j
    }
    function arrayMin(arr) {
        var len = arr.length, min = Infinity;
        while (len--) {
          if (Number(arr[len]) < min) {
            min = Number(arr[len]);
          }
        }
        console.log(min)
      };
      
      function arrayMax(arr) {
        var len = arr.length, max = -Infinity;
        while (len--) {
          if (Number(arr[len]) > max) {
            max = Number(arr[len]);
          }
        }
        console.log(max)
      };
    avg=sum/a.length;
    arrayMin(a);
    arrayMax(a);
    console.log(avg)
}

func(arr);