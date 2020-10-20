function strJoin(s:string, ...str:string[])
{
    var concat:string="";
    for(var ind of str)
    {
        concat=concat+ind+s;
    }
    console.log(concat);
}

strJoin("#","Rita" , "Gita","Sita");