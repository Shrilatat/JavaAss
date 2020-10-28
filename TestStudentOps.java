
public class TestStudentOps {
		public static void main(String[] args) {
			StudentOps sops = new StudentOps();
			sops.setNames();
			sops.printNames();
			sops.getName("2");
			sops.printSize();
			sops.remove("4");
			sops.printNames();
		}
}
