package variabletypes;

class Variables
{
int a=100;
static float b=200.5f;
}
class Sample{
	public static void main(String[] args) {
		int c=30;
		System.out.println(c);
		System.out.println(Variables.b);
		Variables v=new Variables();
		System.out.println(v.a);
	}

}
