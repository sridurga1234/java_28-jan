class stringbuff
{
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("This is StringBuffer");
		System.out.println(s.append("- This is a sample program"));
		System.out.println(s.insert(21,"Object"));
		System.out.println(s.reverse());
		System.out.println(s.replace(14,19,"Builder"));
	}
}
		