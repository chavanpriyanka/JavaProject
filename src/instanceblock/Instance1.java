package instanceblock;

public class Instance1 {
	Instance1()
	{
		System.out.println("0 arg constr");
	}
	
	Instance1(int a)
	{
		System.out.println("1 arg constr");
	}
	
	{
		System.out.println("instance block1");
	}
	{
		System.out.println("instance block2");
	}
	public static void main(String[] args) {
		Instance1 i=new Instance1();
		Instance1 i1=new Instance1(100);

	}

}
