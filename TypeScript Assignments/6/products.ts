export class Product {
            productName: String;
            productId: number;

            constructor(productName: String, productId: number) {
                this.productName = productName;
                this.productId = productId;
            }

            getProduct():void{
                console.log("productId : " + this.productId + " ProductName :" + this.productName);
            }
}