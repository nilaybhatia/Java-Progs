class Test
{
	int a, b;	
	Test(int a, int b)
	{
		this.a = a;
		this.b = b;
	}	
	public Test func(Test o)
	{
		o.a *= 2;
		o.b += 4;
		return o;
	}
	public static void main(String args[])
	{
		Test ob = new Test(2, 3);
		Test ob1 = new Test(0, 0);
		System.out.println("Object's attributes before calling function: ob. a = " + ob.a + " and ob.b = " + ob.b);
		ob1 = ob.func(ob);	
		System.out.println("Object's attributes after calling function: ob. a = " + ob.a + " and ob.b = " + ob.b);
		System.out.println("Object's attributes after calling function: ob1. a = " + ob1.a + " and ob1.b = " + ob1.b);
	}
}
