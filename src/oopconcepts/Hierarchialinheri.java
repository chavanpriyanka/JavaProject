package oopconcepts;

	class X{
		int f=150;
	}
	class Y extends X {
		int g=1000;
	}
	class Z extends X{
		int h=220;
	}
	class F extends X{
		int i=987;
	}
	class Hierarchialinheri{
		public static void main(String[] args) {
			F var=new F();
			System.out.println(var.f);
			System.out.println(var.i);
			
			Z vrr=new Z();
			System.out.println(vrr.h);
			System.out.println(vrr.f);
			
			Y vbr=new Y();
			System.out.println(vbr.g);
			System.out.println(vbr.f);
			
			X vaf=new X();
			System.out.println(vaf.f);		
	}

}
