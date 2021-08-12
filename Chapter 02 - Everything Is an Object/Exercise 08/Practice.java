class StaticTest
{
	static int i = 0;
	int  j = 0;
}
class Practice
{
	public static void main(String[] args)
	{
		StaticTest st1 = new StaticTest();
		StaticTest st2 = new StaticTest();
		System.out.println("Static Variable of 1st Object before Increment      : " + st1.i);
		System.out.println("Non-Static Variable of 1st Object before Increment  : " + st1.j);
		System.out.println("Static Variable of 2nd Object before Increment      : " + st2.i);
		System.out.println("Non-Static Variable of 2nd Object before Increment  : " + st2.j);
		st1.i++;
		st1.j++;
		System.out.println("Static Variable of 1st Object after Increment       : " + st1.i);
		System.out.println("Non-Static Variable of 1st Object after Increment   : " + st1.j);
		st2.j++;
		st2.i++;
		System.out.println("Static Variable of 2nd Object after Increment       : " + st2.i);
		System.out.println("Non-Static Variable of 2nd Object after Increment   : " + st2.j);
		System.out.println("Values of static variable is the cumulative increment of both the objects.");
		System.out.println("Therefore both instances share same static variable.");
	}
}
