function strJoin(sep:string,...allOthers:String[]) :String{
    var sorted : String[] = allOthers.sort();
    var temp:String = sorted.join(sep);
    return temp; 
}


console.log(strJoin("#", "Pushkar", "Rajaram", "Ladkat"));
