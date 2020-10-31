
public class Test_RectangleAssign {
	public static void main(String[] args) {
		RectangleAssign r1 = new RectangleAssign(5,10);
		RectangleAssign r2 = new RectangleAssign(10,15);
		RectangleAssign r3 = new RectangleAssign(11,20);
		RectangleAssign r4 = new RectangleAssign(15,16);
		RectangleAssign r5 = new RectangleAssign(14,15);
		RectangleAssign[] rect_arr = {r1,r2,r3,r4,r5};
		for (RectangleAssign i : rect_arr) {
			i.calcArea();
			i.calcPerimeter();
			System.out.println(i);
		}
	}
}
