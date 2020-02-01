class bike
{
	int speed=60;
}
class Cycle extends bike
{
	int speed=20;
	void show()
	{
		System.out.println("average speed: "+super.speed);
		System.out.println("average speed: "+speed);
	}
}
class sample1
{
	public static void main(String args[])
	{
		Cycle c=new Cycle();
		c.show();
	}
}