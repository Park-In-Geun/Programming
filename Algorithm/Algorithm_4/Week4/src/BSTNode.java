
public class BSTNode {
	
	private BSTNode left; //BSTNode 클래스 내에서만 사용가능한 BSTNode형 left 변수를 선언합니다.
	private int key; //BSTNode 클래스 내에서만 사용가능한 정수형 변수 key를 선언합니다.
	private BSTNode right; //BSTNode 클래스 내에서만 사용가능한 BSTNode형 right 변수를 선언합니다.
	
	public BSTNode(){} //생성자 입니다.
	
	public BSTNode(int key){ //key값이 삽입 되었을 때 사용되는 BSTNode 메서드입니다.
		this.left = null; //this.left에 null값을 넣습니다.
		this.key = key; //this.key에 key값을 넣습니다.
		this.right = null; //this.right에 null값을 넣습니다.
	}

	public BSTNode getLeft() { // left의 getter메서드입니다.
		return left; //left를 반환합니다.
	}

	public void setLeft(BSTNode left) { //left의 setter 메서드입니다.
		this.left = left; //this.left에 삽입된 BSTNode형 left 값을 넣어줍니다.
	}

	public int getKey() { //key의 getter메서드입니다.
		return key; //key를 반환해줍니다.
	}

	public void setKey(int key) { //key의 setter 메서드입니다.
		this.key = key; //this.key에 삽입된 정수형 key값을 넣어줍니다.
	}

	public BSTNode getRight() { //right의 getter메서드입니다.
		return right; //right를 반환해줍니다.
	}

	public void setRight(BSTNode right) { //right의 setter메서드입니다.
		this.right = right; //this.right에 삽입된 BSTNode형 right값을 넣어줍니다.
	}
	
	
}
