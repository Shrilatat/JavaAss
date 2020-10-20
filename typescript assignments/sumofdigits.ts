var num:number=12345;
var stringnum:string= num.toString()
var list:string[] = stringnum.split('');
var sum:number=0
list.forEach(a=>{sum+=parseInt(a)})
console.log(sum)