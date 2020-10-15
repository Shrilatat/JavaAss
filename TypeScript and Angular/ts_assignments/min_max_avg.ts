let list: number[] = [1,2,3,4,5,6,7,8,9];

function min_max_avg(number:number[]){
    number.sort();
    var min = number[0];
    var max = number[number.length-1];

    var sum = 0;
    for(var i of number){
        sum = sum + i;
    }
    var average = sum / number.length; 
    
    console.log("Min is "+min);
    console.log("Max is "+max);
    console.log("Average is"+average);
}

min_max_avg(list);