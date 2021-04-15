public class Week2 { //메인 클래스입니다.

	public static void main(String[] args){
		
		BTree root, leftTree, rightTree; //BTree형 객체 root, leftTree, rightTree를 생성합니다.
		
		leftTree = new BTree(new BTree(), 'A', new BTree()); 
		//leftTree에 BTree() (왼쪽 자식), A(부모) , BTree() (오른쪽 자식)이 삽입된 BTree()메서드를 넣습니다.

		rightTree = new BTree(new BTree(), 'B', new BTree());
		//rightTree에 BTree() (왼쪽 자식), B(부모) , BTree() (오른쪽 자식)이 삽입된 BTree()메서드를 넣습니다.
		root = new BTree(leftTree, '+', rightTree);
		//root에 leftTree(왼쪽 자식), +(부모), rightTree(오른쪽 자식)을 넣습니다.
		
		leftTree = root; //leftTree에 root를 넣습니다. ( + 의 부모)
		
		rightTree = new BTree(new BTree(), 'C', new BTree());
		//rightTree에  BTree() (왼쪽 자식), C(부모) , BTree() (오른쪽 자식)이 삽입된 BTree()메서드를 넣습니다.
		
		root = new BTree(leftTree, '*', rightTree);
		//root에 leftTree(왼쪽 자식), *(부모), rightTree(오른쪽 자식)을 넣습니다. 
		
		leftTree = root; //leftTree에 root를 넣습니다. ( * 의 부모)
		
		rightTree = new BTree(new BTree(), 'D', new BTree());
		//rightTree에  BTree() (왼쪽 자식), D(부모) , BTree() (오른쪽 자식)이 삽입된 BTree()메서드를 넣습니다.
		
		root = new BTree(leftTree, '/', rightTree);
		//root에 leftTree(왼쪽 자식), /(부모), rightTree(오른쪽 자식)을 넣습니다.
		
		System.out.println("===Preorder Traversal==="); //전위 순회 출력문입니다.
		root.preorder(); //preorder() 메서드를 이용해 트리를 전위 순회한 내용을 출력합니다.
		
		System.out.println("\n\n===Inorder Traversal==="); //중위 순회 출력문입니다.
		root.inorder(); //inorder()메서드를 이용해 트리를 중위 순회한 내용을 출력합니다.
		
		System.out.println("\n\n===postorder Traversal==="); //후위 순회 출력문입니다.
		root.postorder(); //postorder()메서드를 이용해 트리를 후위 순회한 내용을 출력합니다.
		
		System.out.println("\n\n===iterative Preorder Traversal==="); //전위 비순회 출력문입니다.
		root.iterPreorder(); //iterPreorder()메서드를 이용해 트리를 전위 비순회한 내용을 출력합니다.
		
		System.out.println("\n\n===iterative Inorder Traversal==="); //중위 비순회 출력문입니다.
		root.iterInorder(); //iterInorder()메서드를 이용해 트리를 중위 비순회한 내용을 출력합니다.
		
	}
}
