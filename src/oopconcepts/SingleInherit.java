package oopconcepts;

class Parent {
	void m1() {
		System.out.println("Inside method m1");
	}
}

class Child extends Parent {
	void m2() {
		System.out.println("Inside method m2");
	}
}

class SingleInherit {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		c.m2();
		Parent p = new Parent();
		p.m1();
		// p.m2();
	}
}
