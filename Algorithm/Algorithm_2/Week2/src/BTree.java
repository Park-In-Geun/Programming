public class BTree { //순환,비순환 이진트리가 구현된 클래스입니다.
	
	private TreeNode root; //TreeNode형 변수 root를 선언합니다.
	
	public BTree(){ //생성자입니다.
		this.root = null; //this.root에 null값을 넣어줍니다.
	}
	public BTree(BTree left, Object data, BTree right)
	//이진트리에서 Btree형 left,right 값, 그리고 data값이 삽입된 사용할 Btree() 메서드입니다.
	{
		root = new TreeNode(data); //TreeNode메서드에 data값을 삽입해 반한된 값을 root(부모)에 넣습니다.
		root.setLeft(left.root); //setleft()메서드에 left.root를 넣습니다.
		root.setRight(right.root);//setRight()메서드에 right.root를 넣습니다.
	}
	public void setRoot(TreeNode root){ this.root = root; }
	//TreeNode형 root가 삽입된 setter메서드 setRoot()로 this.root에 삽입된 root를 넣습니다.
	
	public TreeNode getRoot(){ return this.root; }
	//getter메서드 getRoot()로 this.root를 반환합니다.
	
	public boolean isEmpty(){ return root == null; }
	//boolean형 isEmpty()로 root 가 null값과 같은지를 반환합니다.
	
	public BTree leftSubTree(){ //leftSubTree()메서드입니다.(왼쪽자식)
		BTree leftTree = new BTree(); //Btree형 leftTree 객체를 생성합니다.
		leftTree.root = this.root.getLeft(); //leftTree.root에 this.root의 getLeft() 값을 넣어줍니다.
		return leftTree; //leftTree를 반환합니다.
	} 
	public BTree rightSubTree(){ //rightSubTree()메서드입니다.(오른쪽자식)
		BTree rightTree = new BTree(); //Btree형 rightTree 객체를 생성합니다.
		rightTree.root = this.root.getRight(); //right.root에 this.root의 getRight() 값을 넣어줍니다.
		return rightTree; //rightTree를 반환합니다.
	}
	public Object getRootData(){ //getRootData()메서드입니다.(부모)
		return this.root.getData(); //this.root의 getData()값을 반환합니다.
	}
	
	public void inorder(){ //중위 순회 메서드입니다.
		B_inorder(root); // B_inorder()메서드에 root를 삽입합니다.
	}
	private void B_inorder(TreeNode T){ //BTree클래스 내에서만 사용가능한 B_inorder()메서드로 TreeNode형 T가 삽입됩니다.
		if(T != null){ // T의 값이 null이 아닌지 확인하는 조건문입니다.
			B_inorder(T.getLeft()); //조건이 맞을 경우 B_inorder()메서드에 T.getLeft()값을 넣습니다.(왼쪽 자식 방문)
			System.out.print(T.getData() + " "); //T.getData()값을 출력합니다.(부모 방문)
			B_inorder(T.getRight()); //B_inorder()메서드에 T.getRight()값을 넣습니다.(오른쪽 자식 방문)
		}
	}
	public void preorder(){ //전위 순회 메서드입니다.
		B_preorder(root); //B_preorder()메서드에 root를 삽입합니다.
	}
	private void B_preorder(TreeNode T){ //BTree클래스 내에서만 사용가능한 B_preorder메서드로 TreeNode형 T가 삽입됩니다.
		if(T != null){ //T의 값이 null이 아닌지 확인하는 조건문입니다.
			System.out.print(T.getData() + " "); //조건이 맞을 경우 T.getData()값을 출력합니다.(부모 방문)
			B_preorder(T.getLeft()); //B_preorder()메서드에 T.getLeft()값을 넣습니다.(왼쪽 자식 방문)
			B_preorder(T.getRight()); //B_preorder()메서드에 T.getRight()값을 넣습니다.(오른쪽 자식 방문)
		}
	}
	public void postorder(){ //후위 순회 메서드입니다.
		B_postorder(root); //B_postorder()메서드에 root값을 삽입합니다.
	}
	private void B_postorder(TreeNode T){ //BTree클래스 내에서만 사용가능한 B_preorder메서드로 TreeNode형 T가 삽입됩니다.
		if(T != null){ //T의 값이 null이 아닌지 확인하는 조건문입니다.
			B_postorder(T.getLeft()); //조건이 맞을 경우 B_postorder()메서드에 T.getLeft()값을 넣습니다.(왼쪽 자식 방문)
			B_postorder(T.getRight()); //B_postorder()메서드에 T.getRight()값을 넣습니다.(오른쪽 자식 방문)
			System.out.print(T.getData() + " "); //T.getData()값을 출력합니다.(부모 방문)
		}
	}
	public void iterInorder(){ //중위 비순회 메서드입니다.
		Stack iterTree = new Stack(); //Stack형 객체 iterTree를 생성합니다.
		TreeNode p = root; //TreeNode형 p를 생성하고 root를 넣습니다.
		
		if(p != null){ // p가 null이 아닌지 확인하는 조건문입니다.
			iterTree.push(p); //조건이 맞을 경우 iterTree 스택에 push메서드를 사용해 p값을 삽입합니다.
		}
		
		while(!(iterTree.isEmpty())){ //stack이 원소가 null이 될 때(빌 때) 까지 반복하는 반복문입니다.
			if(p != null){ //p의 값이 null과 같지 않은지 확인하는 조건문 입니다.
				p = iterTree.peek(); //p에다가 stack의 top 원소를 넣습니다.
				p = p.getLeft(); //p에다가 p.getLeft() 값을 넣습니다.(p의 왼쪽자식 방문)
				while(p != null){ //p의 값이 null과 같아질 때 까지 반복하는 반복문입니다.
					iterTree.push(p); //stack의 top에 push() 메서드를 이용하여 p의 값을 넣습니다.
					p = p.getLeft(); //p에다가 p.getLeft() 값을 넣습니다.(p의 왼쪽자식 방문)
				} //반복문 종료
			} //조건문 종료
		p = iterTree.pop(); //pop() 메서드를 이용하여 stack의 top의 원소를 빼내서 p에 넣어줍니다.
		System.out.print(p.getData()+ " "); //p.getData()값을 출력합니다. (부모 방문)
		p = p.getRight(); //p에 p.getRight() 값을 넣습니다. (p의 오른쪽 자식 방문)
		if(p != null){ //p의 값이 null과 같지 않은지 확인하는 조건문입니다.
			iterTree.push(p); //조건이 맞을 경우 push() 메서드를 이용해 stack의 top에 p값을 넣습니다.
		}
		}
	}
	
	public void iterPreorder(){ //전위 비순회 메서드입니다.
		Stack iterTree = new Stack(); //Stack형 객체 iterTree를 생성합니다.
		TreeNode p = root; //TreeNode형 p를 생성하고 root를 넣어줍니다.
		
		if(p != null){ //p의 값이 null과 같지 않은지 확인하는 조건문입니다.
			iterTree.push(p); //조건이 맞을 경우 push() 메서드를 이용해 stack의 top에 p값을 넣습니다. 
		}
		
		while(!(iterTree.isEmpty())){ //stack의 원소가 null이 될 때(빌 때) 까지 반복하는 반복문입니다. 
			if(p != null){ //p 값이 null과 같지 않은지 확인하는 조건문입니다.
				p = iterTree.peek(); //p에다가 stack의 top의 원소를 넣습니다.
				System.out.print(p.getData()+ " "); //p.getData()를 출력합니다.(부모 방문)
				p = p.getLeft(); //p에다가 p.getLeft() 값을 넣습니다.(p의 왼족 자식 방문)
				while(p != null){ //p의 값이 null과 같아질 때 까지 반복하는 반복문입니다.
					System.out.print(p.getData()+ " "); //p.getData()를 출력합니다.(부모 방문)
					iterTree.push(p); //조건이 맞을 경우 push() 메서드를 이용해 stack의 top에 p값을 넣습니다.
					p = p.getLeft(); //p에다가 p.getLeft() 값을 넣습니다.(p의 왼족 자식 방문)
				}
			}
		p = iterTree.pop(); //pop() 메서드를 이용하여 stack의 top의 원소를 빼내서 p에 넣어줍니다.	
		p = p.getRight(); //p에 p.getRight() 값을 넣습니다. (p의 오른쪽 자식 방문)
		if(p != null){ //p의 값이 null과 같지 않은지 확인하는 조건문입니다.
			iterTree.push(p); iterTree.push(p); //조건이 맞을 경우 push() 메서드를 이용해 stack의 top에 p값을 넣습니다.
		}
		}
	}
}
