interface First
{
	default void Display()
	{
		System.out.println("Interface First");
	}
}
interface Second
{
	default void Display()
	{
		System.out.println("Interface Second");
	}
}
class Third
{
	public void Display()
	{
		System.out.println("Class Third");
	}
}
class FtoT extends Third implements First, Second
{
	public static void main(String args[])
	{
		FtoT a = new FtoT();
		a.PrintAll();
	}
	public void PrintAll()
	{
		First.super.Display();
		Second.super.Display();
		super.Display();
	}
}