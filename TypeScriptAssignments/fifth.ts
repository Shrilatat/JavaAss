function doJoin(sep:string, ...str:string[]){

    var temp:string[] = str.sort();
    console.log(temp.join(sep));
}

console.log(doJoin(" ","a","m","i","s","h","a"));