function strJoin(delimiter:string,...names:string[]):string{
    return names.sort().join(delimiter);
}

console.log(strJoin("-","bharat","aditi","bhavya"));