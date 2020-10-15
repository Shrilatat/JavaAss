function arrutilities(arr:number[]):void{
    console.log(Math.min(...arr))
    console.log(Math.max(...arr))
    console.log(arr.reduce((a,b)=>a+b)/arr.length)
}

arrutilities([10,2,5,8,21])
