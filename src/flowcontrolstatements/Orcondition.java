package flowcontrolstatements;

public class Orcondition {

	public static void main(String[] args) {
		int age=18;
		char gender='F';
		if(age>=18 && gender=='F' || age>=21 && gender=='M')
			{
			System.out.println("Eligible for marriage");
			}
		else
		{
	System.out.println("Not Eligible for marriage");
			}
	}

}
