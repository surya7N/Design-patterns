
public class Student {

	static Student e=null;

	private static	int age;
	private static  String name;
	private static double mark;

	public   Student(int age, String name,double mark) {     //Specialized setter
		this.age=age;
		this.name=name;
		this.mark=mark;
	}

	public int getAge() {
		return age;
	}
	public String getName() {
		return name;                                //getters
	}
	public static double getMark() {
		return mark;
	}

	static  public   void createObject() {
		if(e==null)
		{
			e = new Student(22,"surya",65);
			System.out.println("Object created");
		}
		else
		{
			System.out.println("you can't create more than one object...");
		}

		System.out.println("age "+age+" name "+name+" mark "+mark);           //members printing


	}


}
