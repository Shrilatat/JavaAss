// Answer-1

var num:number=12345;
var sum:number=0;
var rem:number;
while(num>0)
 {
    rem=num%10;
    sum+=rem;
    num=Math.floor(num/10);
}
console.log("Sum is:"+sum);


// Answer-2
var x=2;
var y=3;

function power(x,y)
{var power:number=1;
while(y!=0){
    power=power*x;
    y--;
}
console.log("power of "+x+"^"+y +"is "+power);
}
power(x,y);

// Answer-3

var originalArray:number[] = new Array(10,20,30,40)  

function disp(arr:number[]) {
    var min=arr[0];
    var max=arr[0];
    var sum=0;
for (var i of arr){
        if (min>i)
            min=i
        if(max <i)
            max=i
        sum+=i
}
var avg=sum/arr.length;
console.log("max is:"+max);
console.log("min is:"+min);
console.log("avg is:"+avg);
}
disp(originalArray);

// Answer-4

function squarenum(nums:number[]){
    var sqar:number[]=new Array();
    var s:number;
    
    for( var i of nums)
    {
        s=i*i;
        //console.log(s);
        sqar.push(s);
    }
    return sqar;
}

var squareArray:number[]=squarenum(originalArray);
console.log("Original array:"+originalArray);
console.log("Squared Array:" +squareArray);

// Answer-5

function strJoin(s:string,...s1:string[]){
    s1.sort();
    var sorted:string='';
    for(var i of s1)
    {  sorted=sorted+i+s;
    }
    return sorted.substring(0, sorted.length - 1);

}
var s=strJoin('#','Soha','Seema','Sarita');
console.log("concatenated string is:"+s);

// Answer-6

class Product{
    pid:string;
    pname:string;
    price:number;

    constructor(pid:string,pname:string,price:number){
        this.pid=pid;
        this.pname=pname;
        this.price=price;
    }
    getProduct(){
        console.log("productId : " + this.pid + " ProductName :" + this.pname+ " Product price: "+this.price);
    }

}

var parray:Product[]=[];
parray.push(new Product("P1","Mango",45));
parray.push(new Product("P2","Apple",105));

function printAllProducts(p:Product[]){
    for(var i of p)
    console.log(i.getProduct());

}

printAllProducts(parray);

