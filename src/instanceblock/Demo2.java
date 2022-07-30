package instanceblock;

public class Demo2 {
	
//to initialize non-static variable
int a;//0
{
	System.out.println("Inside instance block");
	System.out.println("value of a in instance block" +a);//0
	a=100;//value initialize
}

Demo2(){
	System.out.println("Inside 0 arg constr");
	System.out.println("value of a in constr" +a);//100
}
	public static void main(String[] args) {
		new Demo2();
	}

}
