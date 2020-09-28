document.write("<h1>Hello World! from file</h1>");
for(var i=1;i<=10;i++)
{
	document.write(i+"<br>");
	
}

var v1= 10;
var v2= 12;
var v3= 9;

var name= prompt("enter name");
//alert("Hi "+name);




if(v1>v2){
	if(v1>v3)
		document.write("Largest "+v1);
	else
		document.write("Largest "+v3);
}
else
{
	if(v2>v3)
		document.write("Largest "+v2);
	else
		document.write("Largest "+v3);
}
document.write("<br>");

var n1= parseInt(prompt("enter n1 "));
var n2= parseInt(prompt("enter n2 "));
var sum = n1+n2;
document.write("sum: "+sum+"<br>");

for(var i=0;i<sum;i++)
{
	document.write("Hi "+name+"<br>");
}
		
		