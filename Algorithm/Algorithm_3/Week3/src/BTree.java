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
	
	public void levelOrder() //레벨 순서 순회 메서드 입니다.
	{
		B_levelOrder(); //B_levelOrder()머서드를 실행시킵니다.
	}
	private void B_levelOrder(){ //BTree클래스 내에서만 사용 가능한 B_levelOrder()메서드로 큐를 사용합니다.
		Queue q = new Queue(); //큐 형 객체 q를 생성합니다.
		TreeNode p = root; //TreeNode형 p에 root를 넣습니다.
		
		q.enqueue(root); //q에 root를 넣습니다.
		while(!(q.isEmpty())){ //q가 빌때까지 실행하는 반복문입니다.
			p = q.dequeue(); //q의 맨처음 값을 p에 넣습니다.
			if(p != null){ //p가 null과 같지 않을 경우를 확인하는 조건문입니다.
				System.out.print(p.getData() + " "); //조건이 맞을경우 p의 data를 출력해줍니다.
			if(p.getLeft() != null){ //p의 getLeft(왼쪽 자식)이 null과 같지 않을 경우를 확인하는 조건문입니다.
				q.enqueue(p.getLeft()); //p의 getLeft(왼쪽자식)을 q에 넣습니다.
			}
			if(p.getRight() != null ){ //p의 getRight(오른쪽 자식)이 null과 같지 않을 경우를 확인하는 조건문입니다.
				q.enqueue(p.getRight()); //p의 getRight(오른쪽 자식)을 q에 넣습니다.
			}
			}
		}
	}
	
	public BTree copy(){ //트리를 복사하는 메서드입니다.
		BTree newTree = new BTree(); //BTree형 객체 newTree를 생성합니다.
		newTree.setRoot(treeCopy(this.root)); //treeCopy메서드에 this.root를 넣어서 나온 값을 newTree.setRoot로 받습니다.
		return newTree; //newTree를 반환해줍니다.
	}
	
	private TreeNode treeCopy(TreeNode T){ //Btree클래스 내에서만 사용할 수 있는 TreeNode형 treeCopy메서드로 TreeNode형 T를 받습니다.
		 TreeNode newNode = null; //TreeNode형 newNode를 생성하고 null 값을 넣어줍니다.
		 if(T != null){ //T가 null과 같지 않을 경우를 확인하는 조건문입니다.
			 TreeNode l = treeCopy(T.getLeft()); //조건이 맞을 경우 TreeNode l 을 생성하고 treeCopy메서드에 T.getLeft()값을 넣어 나온 값을 넣습니다.
			 TreeNode r = treeCopy(T.getRight()); //TreeNode r 을 생성하고 treeCopy메서드에 T.getRight()값을 넣어 나온 값을 넣습니다.
			 newNode = T; //newNode에 매개변수 T를 받습니다.
			 newNode.setLeft(T.getLeft()); //newNode.setLeft로 T.getLeft()값을 받습니다. (왼쪽 자식 복사)
			 newNode.setRight(T.getRight()); //newNode.setRight로 T.getRight()값을 받습니다. (오른쪽 자식 복사)
			 newNode.setData(T.getData()); //newNode.setData로 T.getData()값을 받습니다. (부모 복사)
		 }
		 return newNode; //복사한 newNode를 반환합니다.
	}
	
	public boolean Equal(BTree A){ //boolean형 Equal메서드로 Btree형 A를 받습니다. 값이 같은지 확인합니다.
		return treeEqual(this.root, A.getRoot()); //treeEqual메서드에 this.root와 A.getRoot()값을 넣어 나온 값을 반환합니다.
	}
	
	private boolean treeEqual(TreeNode root, TreeNode A){ //Btree클래스 내에서만 사용가능한 boolean형 treeEqual메서드로 TreeNode형 root와 A값을 받습니다.
		if(root == null && A == null) return true; //root값과 A값이 둘다 null과 같을경우를 확인하고 조건이 맞을시 true를 반환합니다.
		else if(root != null && A != null){ //root값과 A값이 둘다 null과 같지 않을경우를 확인합니다.
			if(root.getData() == A.getData()){ //root.getData()값과 A.getData()값이 같은지 확인합니다.
				if(treeEqual(root.getLeft(),A.getLeft())){ //treeEqual메서드에 root.getData()와 A.getData()를 넣어 같은지 확인합니다.
					return treeEqual(root.getRight(),A.getRight()); //treeEqual메서드에 root.getRight와 A.getRight값을 넣어 반환합니다.
				}
			}
			else return false; //root.getData()값과 A.getData()값이 다를 경우 false를 반환합니다.
		}
		return false; //root값과 A값 둘 중 하나가 null값인 경우 false를 반환합니다.
	}
}
