var arr:number[] = [1,2,3,4,5,6,7];
for(var i=0;i<arr.length;i++){
    console.log(arr[i])
}

for(var j in arr){
    console.log(j);
   
}


for(var k of arr){
    console.log(k);
}

function greet(name: string):string{
    return "hello"+name;
}

console.log(greet("name"));

function display(name:string, id:number=101, email?:string){
    console.log(id);
    console.log(name);
    if(email!=undefined){
        console.log(email);
    }
}
display("hello",29);
display("helloname");

setTimeout(()=>{console.log("lambda timeout")},6000);

var names:string[] = ['aaa','bbb','cc'];
names.forEach((n)=>console.log(n));