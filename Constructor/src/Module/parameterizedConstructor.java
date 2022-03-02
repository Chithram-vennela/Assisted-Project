package Module;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}


public class parameterizedConstructor {

	public static void main(String[] args) {Std std1=new Std(5,"vennela");
	Std std2=new Std(15,"Spandhana");
	std1.display();
	std2.display();
	

		
	}

}
