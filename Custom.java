package Example;
public class Custom {
	public void marks(int marks)
	{
		try
		{
		if(marks<=32)
		{
			throw new Invalidvalue("Student fail in exam");
		}
		}
		
		catch(Invalidvalue v)
		{
			System.out.println(v.getMessage());
		}
		if(marks>32)
		{
			System.out.println("student passed in exam");
		}

}
	public static void main(String args[])
	{
		Custom s=new Custom();
		s.marks(4);
	}
}
