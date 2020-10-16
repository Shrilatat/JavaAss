// Question 5

let arrayOfStrings = ["hello","this","is","a","sentence"];


function strJoin(separator:any,myArray:string[]){
    let myStr:string = myArray.join(separator);
    console.log(myStr);
}

strJoin(",",arrayOfStrings);