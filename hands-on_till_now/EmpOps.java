package day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmpOps {
	private List<Emp> employeesList = new LinkedList<>();
	
	
	
	public EmpOps() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addEmp(Emp emp) {
		employeesList.add(emp);
	}
	
	public void deleteEmp(int empNo) {
		employeesList.remove(empNo);
	}
	
	public void displayAllEmp() {
		Iterator<Emp> it = employeesList.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public void incrSal() {
		Iterator<Emp> it = employeesList.iterator();
		while(it.hasNext())
			it.next().setSal( (float) (it.next().getSal() * 1.1)); 
	}
	
	public void displayEmpDetails(int id) {
		for (int i = 0; i < employeesList.size(); i++) {
			if(employeesList.get(i).getEmpNo()==id) {
				System.out.println(employeesList.get(i));
				break;
			}
			else {
				System.out.println("Id not found");
			}
				
		}
	}
	
	public void displayEmpWithDesign(String design) {
		for (int i = 0; i < employeesList.size(); i++) {
			if(employeesList.get(i).getDesig()==design) {
				System.out.println(employeesList.get(i));
				break;
			}
			else {
				System.out.println("Designation not found");
			}
				
		}
	}
}
