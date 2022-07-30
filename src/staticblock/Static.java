package staticblock;

public class Static {
	static {
		System.out.println("Inside static block-1");
	}
	static {
		System.out.println("Inside static block-2");
	}
	{
		System.out.println("Inside non-static block-3");
	}
	public static void main(String[] args) {
		Static s=new Static(); 
		
		}

}
