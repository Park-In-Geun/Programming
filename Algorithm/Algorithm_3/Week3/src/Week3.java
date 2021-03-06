
public class Week3 {
	public static void main(String[] args){
		
		BTree root, leftTree, rightTree, equal_test;
		
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
		equal_test = new BTree(rightTree, 'A', leftTree);
		//트리가 같은지 확인하기 위해 equal_test에 rightTree(왼쪽 자식), A(부모), leftTree(오른쪽 자식)이 삽입된 BTree()메서드를 넣습니다.
		
		System.out.println("===Inorder Traversal==="); //중위 순회 출력문입니다.
		root.inorder(); //inorder()메서드를 이용해 트리를 중위 순회한 내용을 출력합니다.
		
		System.out.println("\n\n===Level Order Traversal==="); //레벨 순회 출력문입니다.
		root.levelOrder(); //levelOrder()메서드를 이용해 트리를 레벨 순회한 내용을 출력합니다.
		
		System.out.println("\n\n===Tree Copy==="); //트리를 복사하는 출력문입니다.
		BTree copy_tree = root.copy(); //Btree형 copy_tree객체를 생성하고 root.copy()를 이용해 트리를 복사합니다.
		System.out.println("Inorder Traversal of basic Tree"); //기존 트리의 중위 순회 출력문입니다.
		root.inorder(); //inorder()메서드를 이용해 트리를 중위 순회한 내용을 출력합니다.
		System.out.println("\nInorder Traversal of copy Tree"); //복사한 트리의 중위 순회 출력문입니다.
		copy_tree.inorder(); //copy_tree.inoroder() 를 사용해 복사한 트리 내용을 출력합니다.
	
		System.out.println("\n\nanswer : " + root.Equal(copy_tree));
		//root.Equal메서드에 copy_tree를 넣어 기존의 트리와 같은지 확인하고 결과를 출력합니다.
		System.out.println("answer : " + root.Equal(equal_test));
		//root.Equal메서드에 equal_test를 넣어 기존의 트리와 같은지 확인학 결과를 출력합니다.
	}
}
