package constructors;

class Constr1 {
Constr1()
{
	System.out.println("0 arg");
}
Constr1(int a)
{
	System.out.println("1 arg");
}
	public static void main(String[] args) {
		Constr1 c=new Constr1();
		Constr1 c1=new Constr1(100);
		
	}

}
