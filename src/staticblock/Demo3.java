package staticblock;

public class Demo3 {
static int a;//
static
{
System.out.println("value of a in static block" +a);
a=100;
}
static void m1() {
System.out.println("Inside method m1" +" " +a);

}
	public static void main(String[] args) {
	Demo3.m1();

	}

}
