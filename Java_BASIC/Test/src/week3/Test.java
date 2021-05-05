package week3;

public class Test {
	public static void main(String args[]) { 
		ClassA aa = new ClassA();
		ClassB bb = new ClassB();
		ClassA ab = new ClassB();

		ClassB.methodFour(0);
		ClassA.methodFour(0);
		aa.methodTwo(0);
		bb.methodTwo(0);
		ab.methodTwo(0);
    } 
}
