package oopconcepts;

class A{
	int a=100;
}
class B extends A {
	int b=1000;
}
class C extends B{
	int c=220;
}
class D extends C{
	int d=987;
}
class Multilevelinheri{
	public static void main(String[] args) {
		D var=new D();
		System.out.println(var.d);
		System.out.println(var.c);
		System.out.println(var.b);
		System.out.println(var.a);
		
		C vrr=new C();
		System.out.println(vrr.c);
		System.out.println(vrr.b);
		System.out.println(vrr.a);
		
		D vbr=new D();
		System.out.println(vbr.b);
		System.out.println(vbr.a);
		
		D vaf=new D();
		System.out.println(vaf.a);	
	}

}
