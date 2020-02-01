class Superclass
{
	public void printMethod()
	{
		System.out.println("printed in superclass.");
	}
}
 class Subclass extends Superclass
{
	public void printMethod()
	{
		super.printMethod();
		System.out.println("printed in subclass");
	}
}
class subclass1
{
	public static void main(String args[])
	{
		Subclass s=new Subclass();
		s.printMethod();
	}
}