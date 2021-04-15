public class Week2 { //���� Ŭ�����Դϴ�.

	public static void main(String[] args){
		
		BTree root, leftTree, rightTree; //BTree�� ��ü root, leftTree, rightTree�� �����մϴ�.
		
		leftTree = new BTree(new BTree(), 'A', new BTree()); 
		//leftTree�� BTree() (���� �ڽ�), A(�θ�) , BTree() (������ �ڽ�)�� ���Ե� BTree()�޼��带 �ֽ��ϴ�.

		rightTree = new BTree(new BTree(), 'B', new BTree());
		//rightTree�� BTree() (���� �ڽ�), B(�θ�) , BTree() (������ �ڽ�)�� ���Ե� BTree()�޼��带 �ֽ��ϴ�.
		root = new BTree(leftTree, '+', rightTree);
		//root�� leftTree(���� �ڽ�), +(�θ�), rightTree(������ �ڽ�)�� �ֽ��ϴ�.
		
		leftTree = root; //leftTree�� root�� �ֽ��ϴ�. ( + �� �θ�)
		
		rightTree = new BTree(new BTree(), 'C', new BTree());
		//rightTree��  BTree() (���� �ڽ�), C(�θ�) , BTree() (������ �ڽ�)�� ���Ե� BTree()�޼��带 �ֽ��ϴ�.
		
		root = new BTree(leftTree, '*', rightTree);
		//root�� leftTree(���� �ڽ�), *(�θ�), rightTree(������ �ڽ�)�� �ֽ��ϴ�. 
		
		leftTree = root; //leftTree�� root�� �ֽ��ϴ�. ( * �� �θ�)
		
		rightTree = new BTree(new BTree(), 'D', new BTree());
		//rightTree��  BTree() (���� �ڽ�), D(�θ�) , BTree() (������ �ڽ�)�� ���Ե� BTree()�޼��带 �ֽ��ϴ�.
		
		root = new BTree(leftTree, '/', rightTree);
		//root�� leftTree(���� �ڽ�), /(�θ�), rightTree(������ �ڽ�)�� �ֽ��ϴ�.
		
		System.out.println("===Preorder Traversal==="); //���� ��ȸ ��¹��Դϴ�.
		root.preorder(); //preorder() �޼��带 �̿��� Ʈ���� ���� ��ȸ�� ������ ����մϴ�.
		
		System.out.println("\n\n===Inorder Traversal==="); //���� ��ȸ ��¹��Դϴ�.
		root.inorder(); //inorder()�޼��带 �̿��� Ʈ���� ���� ��ȸ�� ������ ����մϴ�.
		
		System.out.println("\n\n===postorder Traversal==="); //���� ��ȸ ��¹��Դϴ�.
		root.postorder(); //postorder()�޼��带 �̿��� Ʈ���� ���� ��ȸ�� ������ ����մϴ�.
		
		System.out.println("\n\n===iterative Preorder Traversal==="); //���� ���ȸ ��¹��Դϴ�.
		root.iterPreorder(); //iterPreorder()�޼��带 �̿��� Ʈ���� ���� ���ȸ�� ������ ����մϴ�.
		
		System.out.println("\n\n===iterative Inorder Traversal==="); //���� ���ȸ ��¹��Դϴ�.
		root.iterInorder(); //iterInorder()�޼��带 �̿��� Ʈ���� ���� ���ȸ�� ������ ����մϴ�.
		
	}
}
