var arr:number[] = [1,2,3,4,5,6,7];
for(var i=0;i<arr.length;i++){
    console.log(arr[i])
}

for(var j in arr){
    console.log(j);
    //ABove line gives the index because 'in' gives the index
}


for(var k of arr){
    console.log(k);
    //ABove line gives the actual because 'of' gives the values
}

//function with return type and parameter
function greetText(name: string):string{
    return "hello"+name;
}
console.log(greetText(" naruto"));

//function with optional parameter
function disp(name:string, id:number=789, email?:string){
    console.log(id);
    console.log(name);
    if(email!=undefined){
        console.log(email);
    }
}
disp("prat",29);
disp("pratjao");

//lambda
setTimeout(()=>{console.log("in timeout lambda")},1000);

var names:string[] = ['kkk','mmm','kj'];
names.forEach((n)=>console.log(n));