package Extends;

public class ABTest {
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		A ab = (A) b; //A ab = new B();
		System.out.println("a.val = " + a.val); //3
		System.out.println("b.val = " + b.val); //5
		System.out.println("ab.val = " + ab.val); // 3
		System.out.print("\n a.f(a)="); a.f(a); // Af(a)
		System.out.print("\n a.f(b)="); a.f(b); // Af(b)
		System.out.print("\n b.f(a)="); b.f(a); // Bf(a)
		System.out.print("\n b.f(b)="); b.f(b); // Bf(b)
		System.out.print("\n a.f(ab)="); a.f(ab); // Af(a)
		System.out.print("\n b.f(ab)="); b.f(ab); // Bf(a)
		System.out.print("\n ab.f(a)="); ab.f(a); // Bf(a)
		System.out.print("\n ab.f(b)="); ab.f(b); // Bf(b)
		System.out.print("\n ab.f(ab)="); ab.f(ab); // Bf(a)
	} 

}
