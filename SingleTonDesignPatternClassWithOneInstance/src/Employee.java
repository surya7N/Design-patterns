
public class Employee {

	static 	Employee e=null; //Static method reference shall  be static (static to static call only possible) without putting static keyword here it will become Nonstatic reference

	private Employee()         // We shall restrict outside calling from the main() so,it shall be private (accessible from inside only)
	{

	}

	static void createObject()  //static method can solely be called with Class name
	{
		if(e==null)
		{
			e=new Employee();
			System.out.println("object created");
		}
		else
		{
			System.out.println("object not created");
		}
	}
}
