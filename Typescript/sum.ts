var sum=0;
function addDigits(num)
{

while(num)
{
 sum += num % 10;
    num = num / 10;
}
console.log(sum);
}

addDigits(25252);