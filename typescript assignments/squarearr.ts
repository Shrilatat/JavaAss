function sqrarray(arr:number[]):number[]{
    var result:number[];
    return arr.map(ele=>ele*ele)

}


console.log(sqrarray([1,2,3,4,5]));