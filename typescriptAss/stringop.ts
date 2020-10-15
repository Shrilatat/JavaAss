var strJoin=function(str:string, ...arr:string[]):string{
    arr.sort();
    var op=arr.join(str)
    return op;   
}

console.log(strJoin("#","aa","bbb","ccc","dd"))