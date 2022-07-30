package constructors;

public class Demo1 {
	
	//to initialize non-static variables
int a; //0
Demo1(){
	System.out.println("0 arg constructor");
	System.out.println(a);
	a=1000;//initialize value
}
	public static void main(String[] args) {
		Demo1 d=new Demo1();//store value of a
		System.out.println(d.a);//print value of a
	}

}
