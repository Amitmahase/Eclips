package Encapsulation;

public class Employee {
	
	private String emp_name;
	private int emp_id;
	private String DOJ;
	
	public void setEmpname(String ename)
	{
		emp_name=ename;
	}
	public String getEmpname()
	{
		return emp_name;
	}
	
	public void setEmpid(int eid)
	{
		emp_id=eid;
	}
	public int getEmpid()
	{
		return emp_id;
	}
	public void setDOJ(String dj)
	{
		DOJ=dj;
	}
	public String getDOJ()
	{
		return DOJ;
	}
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setDOJ("01/03/2018");
		e.setEmpid(49445);
		e.setEmpname("Amit Kumar");
		
		System.out.println("Employee name : "+ e.getEmpname());
		System.out.println("Emp_Id= "+e.getEmpid());
		System.out.println("Date of joining : "+e.getDOJ());
		
		
	}

	
	
			
			
			
}
