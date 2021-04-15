
public class Week3 {
	public static void main(String[] args){
		
		BTree root, leftTree, rightTree, equal_test;
		
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
		equal_test = new BTree(rightTree, 'A', leftTree);
		//Ʈ���� ������ Ȯ���ϱ� ���� equal_test�� rightTree(���� �ڽ�), A(�θ�), leftTree(������ �ڽ�)�� ���Ե� BTree()�޼��带 �ֽ��ϴ�.
		
		System.out.println("===Inorder Traversal==="); //���� ��ȸ ��¹��Դϴ�.
		root.inorder(); //inorder()�޼��带 �̿��� Ʈ���� ���� ��ȸ�� ������ ����մϴ�.
		
		System.out.println("\n\n===Level Order Traversal==="); //���� ��ȸ ��¹��Դϴ�.
		root.levelOrder(); //levelOrder()�޼��带 �̿��� Ʈ���� ���� ��ȸ�� ������ ����մϴ�.
		
		System.out.println("\n\n===Tree Copy==="); //Ʈ���� �����ϴ� ��¹��Դϴ�.
		BTree copy_tree = root.copy(); //Btree�� copy_tree��ü�� �����ϰ� root.copy()�� �̿��� Ʈ���� �����մϴ�.
		System.out.println("Inorder Traversal of basic Tree"); //���� Ʈ���� ���� ��ȸ ��¹��Դϴ�.
		root.inorder(); //inorder()�޼��带 �̿��� Ʈ���� ���� ��ȸ�� ������ ����մϴ�.
		System.out.println("\nInorder Traversal of copy Tree"); //������ Ʈ���� ���� ��ȸ ��¹��Դϴ�.
		copy_tree.inorder(); //copy_tree.inoroder() �� ����� ������ Ʈ�� ������ ����մϴ�.
	
		System.out.println("\n\nanswer : " + root.Equal(copy_tree));
		//root.Equal�޼��忡 copy_tree�� �־� ������ Ʈ���� ������ Ȯ���ϰ� ����� ����մϴ�.
		System.out.println("answer : " + root.Equal(equal_test));
		//root.Equal�޼��忡 equal_test�� �־� ������ Ʈ���� ������ Ȯ���� ����� ����մϴ�.
	}
}