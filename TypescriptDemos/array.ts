export function arrayOp(arr){
    var mn=Number.NEGATIVE_INFINITY
    var mx=Number.POSITIVE_INFINITY;
    var sum=0;

    for(const i of arr){
        sum+=i;
        mn=Math.min(mn,i);
        mx=Math.max(mx,i);
    }
    console.log(mn + " " + mx + " " + sum);
}