function strJoin(separator:string, ...strs:string[]){
    strs.sort();
    var concatStr:string="";
    for(var x of strs){
        concatStr=concatStr+x+separator;
    }
    console.log(concatStr);
}
strJoin("#","Pooja","Siya","Manasi","Diya");
