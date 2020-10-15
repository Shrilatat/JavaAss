var num:number = 99999;

var sum:number = 0;

for(var i = 0; i < 5; i++ )
{
    sum = sum + num % 10;
    num = Math.floor(num / 10);
}

console.log(sum);