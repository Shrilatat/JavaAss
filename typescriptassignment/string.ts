function strJoin(str1:string,str2:string,str3:string,str4:string)
{
    var out:string="";
    var out=out.concat(str1);
    var out=out.concat(str2);
    var out=out.concat(str1);
    var out=out.concat(str3);
    var out=out.concat(str1);
    var out=out.concat(str4);
    return out; 
}

var outStr:string= strJoin("#","sid","adi","pratik");
console.log(outStr);