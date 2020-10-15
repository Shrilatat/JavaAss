class product{
    pid:number=0;
    pname:string=null;
    constructor(pid:number,pname:string)
    {
        this.pid=pid;
    }
     objArray:product[]=[new product(1,"Biscuits"),new product(2,"Cookies"),new product(3,"Cakes")];
    //obj:Array<product>;
    //product=[new product(1,"Biscuits"),new product(2,"Cookies"),new product(3,"Cakes")];
    
        public display(obj:product[]) {
        console.log("The product list is : \n");
        for(var index of obj)
        {
            console.log("ID: "+index.pid);
            console.log("Name: "+index.pname);
        }
        }  
   }
}
