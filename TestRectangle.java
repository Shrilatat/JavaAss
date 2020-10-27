class Rectangle {
	private int len,bre,area,per;


	public Rectangle(int len, int bre) {
		this.len = len;
		this.bre = bre;
	}


	public Rectangle() {
		super();
	}
	public void area() {
		
		this.area =  this.len * this.bre;
		
	}
	
	public void perimeter() {
		this.per= 2*(this.len + this.bre);
		
	}


	@Override
	public String toString() {
		return "Rectangle [len=" + len + ", bre=" + bre + ", area=" + area + ", per=" + per + "]";
	}


	public int getLen() {
		return len;
	}


	public void setLen(int len) {
		this.len = len;
	}


	public int getBre() {
		return bre;
	}


	public void setBre(int bre) {
		this.bre = bre;
	}
	
	
	

}



public class TestRectangle {
	public static void main(String[] args) {
		/*
		 * Rectangle r =new Rectangle(4,5); r.area(); r.perimeter();
		 * System.out.println(r.toString());
		 */
				
		Rectangle[] rects = new Rectangle[5];
		int[] bres = {1,2,3,4,5};
		int[] lens = {1,2,6,8,11};
        
		for(int i = 0; i < 5; i++) {
			Rectangle r =new Rectangle(bres[i],lens[i]);
			
			rects[i] = r ;
			rects[i].area();
			rects[i].perimeter();
			System.out.println(rects[i].toString());
			
		}
		
		
		
	}

}
