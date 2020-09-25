package practice;

public class TestEmpOps {
public static void main(String[] args) {
	EmpOps obj=new EmpOps
			();
	obj.addEmp(new Emp(1,"abhi",20,"manager"));
	obj.addEmp(new Emp(2,"abhinav",30,"manager1"));
	obj.addEmp(new Emp(3,"abhinav1",40,"manager2"));
	obj.addEmp(new Emp(3,"abhinav2",50,"manager3"));
	obj.deleteEmp(1);
	obj.displayAllEmps();
	obj.incrSal();
	obj.displayEmpDetails(3);
}
}
