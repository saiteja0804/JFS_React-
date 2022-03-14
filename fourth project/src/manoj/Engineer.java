package manoj;

public class Engineer extends employee1
{
	private int id;
	private String name;
	private String ssn;
	private double salary;
	public Engineer(int Id,String Name,String Ssn,double Salary)
	{
      id=Id;
      name=Name;
      ssn=Ssn;
      salary=Salary;
	}
	public String toString()
	{
		return "[id= "+id+", "+"Name= "+name+", ssn= "+ssn+", salary= "+salary+"]";
	}

	public static void main(String[] args)
	{
	Engineer e1=new Engineer(101,"Jane smith","012-34-5678",120_345.27);
	
	}
}
