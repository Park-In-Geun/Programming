package Extends;

public class B extends A {
	int val=5;
	public void f(A a) { System.out.print("Bf(a)"); }
	public void f(B b) { System.out.print("Bf(b)"); }
}
