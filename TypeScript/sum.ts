var num:number=12345;
var digit:number=0;
var sum:number=0;
 while(num > 0)
        {
            digit = num % 10;
            sum=sum+digit;
            num = num / 10; 
        }
console.log("Sum of digits: "+sum);