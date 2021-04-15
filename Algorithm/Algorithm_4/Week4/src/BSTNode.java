
public class BSTNode {
	
	private BSTNode left; //BSTNode Ŭ���� �������� ��밡���� BSTNode�� left ������ �����մϴ�.
	private int key; //BSTNode Ŭ���� �������� ��밡���� ������ ���� key�� �����մϴ�.
	private BSTNode right; //BSTNode Ŭ���� �������� ��밡���� BSTNode�� right ������ �����մϴ�.
	
	public BSTNode(){} //������ �Դϴ�.
	
	public BSTNode(int key){ //key���� ���� �Ǿ��� �� ���Ǵ� BSTNode �޼����Դϴ�.
		this.left = null; //this.left�� null���� �ֽ��ϴ�.
		this.key = key; //this.key�� key���� �ֽ��ϴ�.
		this.right = null; //this.right�� null���� �ֽ��ϴ�.
	}

	public BSTNode getLeft() { // left�� getter�޼����Դϴ�.
		return left; //left�� ��ȯ�մϴ�.
	}

	public void setLeft(BSTNode left) { //left�� setter �޼����Դϴ�.
		this.left = left; //this.left�� ���Ե� BSTNode�� left ���� �־��ݴϴ�.
	}

	public int getKey() { //key�� getter�޼����Դϴ�.
		return key; //key�� ��ȯ���ݴϴ�.
	}

	public void setKey(int key) { //key�� setter �޼����Դϴ�.
		this.key = key; //this.key�� ���Ե� ������ key���� �־��ݴϴ�.
	}

	public BSTNode getRight() { //right�� getter�޼����Դϴ�.
		return right; //right�� ��ȯ���ݴϴ�.
	}

	public void setRight(BSTNode right) { //right�� setter�޼����Դϴ�.
		this.right = right; //this.right�� ���Ե� BSTNode�� right���� �־��ݴϴ�.
	}
	
	
}
