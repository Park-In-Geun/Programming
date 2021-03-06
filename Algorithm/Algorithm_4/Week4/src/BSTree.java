
public class BSTree { // 트리 클래스입니다.

	private BSTNode root; //BSTNode형 root 변수를 선언합니다.
	
	public BSTNode search(int key){ //BSTNode search 메서드입니다. key값을 받습니다.
		BSTNode p; //BSTNode형 p를 선언합니다. 
		p = root; //p에 root를 넣어줍니다.
		while(p != null){ //p가 null값이 될 때 까지 반복하는 반복문입니다.
			if(p.getKey() > key){ //p의 getKey()값이 삽입된 정수형 key값보다 큰 지 확인합니다.
				p = p.getLeft(); //조건이 맞을경우 p에 p의 getLeft() (왼쪽 자식)을 넣어줍니다.
			}
			else if(p.getKey() == key){ //위의 조건과 다른 경우로 p의 getKey값이 삽입된 정수형 key값과 같은지 확인합니다.
				return p; //조건이 맞을경우 p값을 반환합니다.
			} 
			else p = p.getRight(); //위의 두 조건을 모두 만족하지 않을 경우 p에 p의 getRight() (오른쪽 자식)을 넣어줍니다.
		}
		return p; //p를 반환해줍니다.
	}
	
	public void insert(int key){ //트리에 정수형 key값을 삽입하는 메서드입니다.
		BSTNode p,q=null; //BSTNode형 p,q 를 선언하고 q에 null값을 넣어줍니다.
		
		p = root; //p에 root값을 넣어줍니다.
		while(p != null){ //p가 null값이 될 때 까지 반복하는 반복문입니다.
			if(key == p.getKey()) return; //key가 p의 getKey() 값과 같은지 확인하고 조건이 맞을 경우 아무것도 반환하지 않습니다.
			q = p; //q에 p값을 넣어줍니다.
			if(key < p.getKey()){ //key가 p의 getKey()값보다 작은지 확인합니다.
				p = p.getLeft(); //p에 p의 getLeft() (왼쪽 자식) 을 넣어줍니다.
			}
			else{ //key가 p의 getKey() 값보다 클 경우입니다.
				p = p.getRight(); //p에 p의 getRight() (오른쪽 자식) 을 넣어줍니다.
			}
		}
		BSTNode newNode = new BSTNode(); //BSTNode형 newNode를 생성합니다.
		newNode.setKey(key); //newNode의 setKey에 key값을 넣어줍니다. (부모)
		newNode.setRight(null); //newNode의 setRight에 null값을 넣어줍니다. (오른쪽 자식)
		newNode.setLeft(null); //newNode의 setLeft에 null값을 넣어줍니다. (왼쪽 자식)
		if(root == null){ root = newNode;} //root가 null값과 같은지 확인하고 조건이 맞을 경우 root에 newNode를 넣어줍니다.
		else if(key < q.getKey()){q.setLeft(newNode);;} 
		//q의 getKey값이 key값보다 클 경우를 확인하고 조건이 맞을 경우 q.setLeft에 newNode를 넣어줍니다. (q의 왼쪽 자식에 newNode값을 연결)
		else //위의 두 조건이 모두 만족하지 않을 경우에 실행합니다.
			q.setRight(newNode); //q의 setRight에 newNode를 넣어줍니다. (q의 오른쪽 자식에 newNode값을 연결)
		return; //아무것도 반환하지 않습니다.
	}
	
	public void delete(int key){ //트리에서 정수형 key값을 삭제하는 메서드입니다.
		BSTNode parent=root; //BSTNode형 parent를 선언하고 root값을 넣어줍니다.
		BSTNode	p=root; //BSTnode형 p를 선언하고 root값을 넣어줍니다.
		
		boolean isLeftChild = false; //boolean형 isLeftChild를 선언하고 false를 넣어줍니다.
		
		while(p.getKey() != key){ //p의 getKey()값이 삭제하려는 정수형 key값과 같을 때 까지 반복하는 반복문 입니다.
			parent = p; //parent에 p를 넣어줍니다.
			if (p.getKey() > key){ //p의 getKey()가 삭제하려는 key값보다 큰지 확인합니다.
				isLeftChild = true; //조건이 맞을 경우 isLeftChild에 true를 넣어줍니다.
				p = p.getLeft(); //p에 p의 getLeft() (왼쪽 자식) 을 넣어줍니다.
			}
			else{ //위의 조건이 맞지 않을 경우에 실행합니다.
				isLeftChild = false; //isLeftChild에 false를 넣어줍니다.
				p = p.getRight(); //p에 p의 getRight() (오른쪽 자식)을 넣어줍니다.
			}
			if (p == null) //p가 null(비었을 경우)과 같은지 확인합니다.
				return; //아무것도 반환해 주지 않습니다.
		}
		
		if((p.getLeft() == null) && (p.getRight() == null)){ 
			//p의 getLeft() (왼쪽 자식)이 null과 같고 p의 getRight() (오른쪽 자식)이 null과 같은지 확인하는 조건문 입니다.
			
			if(p == root) //p와 root가 같은지 확인하는 조건문입니다.
				root = null; //조건이 맞을 경우 root에 null값을 넣어줍니다.
			if(isLeftChild == true) //isLeftChild가 true와 같은지 확인하는 조건문입니다.
				parent.setLeft(null); //조건이 맞으면 parent의 setLeft에 null값을 넣어줍니다. (왼쪽 자식 삭제)
			else //위의 조건과 다를 경우에 실행합니다.
				parent.setRight(null); //parent의 setRight에 null값을 넣어줍니다.(오른쪽 자식 삭제)
		}
		
		else if((p.getRight() == null) || p.getLeft() == null){
			//p의 getRight() (오른쪽 자식) 와 p의 getLeft() (왼쪽 자식) 중 하나라도 null인지 확인 하는 조건문입니다.
			
			if(p.getRight() == null){ //p의 getRight() (오른쪽 자식)이 null과 같은지 확인하는 조건문입니다.
				if(p == root) //조건이 맞을 경우 p와 root가 같은지 확인하는 조건문입니다.
					root = p.getLeft(); //root의 값에 p의 getLeft() (왼쪽 자식) 을 넣어줍니다.
				else if (isLeftChild) //isLeftChild가 true인지 false인지 확인하는 조건문입니다.
					parent.setLeft(p.getLeft()); //true일 경우 parent의 setLeft에 p의 getLeft() (왼쪽 자식) 을 넣어줍니다.
				else //위의 두 경우가 모두 아닐 경우에 실행합니다.
					parent.setRight(p.getLeft()); //parent의 setRight에 p의 getLeft() (왽쪽 자식) 을 넣어줍니다.
			}
			
			else if (p.getLeft() == null){ //p의 getLeft() (왼쪽 자식) 가 null과 같은지 확인합니다.
				if(p == root) //p와 root가 같은지 확인합니다.
					root = p.getRight(); //조건이 맞을 경우 root에 p의 getRight() (오른쪽 자식) 를 넣어줍니다.
				else if (isLeftChild) //isLeftChild가 true인지 false인지 확인하는 조건문입니다.
					parent.setLeft(p.getRight()); //true일 경우 parent의 setLeft 에 p의 getRight() (오른쪽 자식) 을 넣어줍니다.
				else //위의 두 경우가 모두 아닐 경우에 실행합니다.
					parent.setRight(p.getRight()); // parent의 setRight 에 p이 getRight() (오른쪽 자식) 을 넣어줍니다.
			}
		}
		else if(p.getLeft() != null && p.getRight() != null){ 
			//p의 getLeft() (왼쪽 자식) 와 p의 getRight() (오른쪽 자식) 가 둘다 null 이 아닌지 확인하는 조건문입니다.
			
			BSTNode q = minNode(p); //BSTNode형 q를 선언하고 minNode 메서드에 p값을 넣어 나온 결과를 넣어줍니다.
			
			if(p == root) //p와 root가 같은지 확인하는 조건문입니다.
				root = q; //조건이 맞을 경우 root에 q를 넣어줍니다.
			else if (isLeftChild) //isLeftChild가 true인지 false인지 확인하는 조건문입니다.
				parent.setLeft(q); //조건이 맞을 경우 parent의 setLeft에 q를 넣어줍니다.
			else //위의 두 경우가 모두 아닐 경우에 실행합니다.
				parent.setRight(q); //parent의 setRight에 q를 넣어줍니다.
				q.setLeft(p.getLeft()); //q의 setLeft에 p의 getLeft() (왼쪽 자식) 을 넣어줍니다.
		}
		return; //아무것도 반환하지 않습니다.
	}
	
	private BSTNode minNode(BSTNode deleleBSTNode){ //BSTree 클래스 내에서만 사용 가능한 BSTNode형 minNode 메서드입니다. BSTNode형 을 삽입받습니다.
		
		BSTNode min = null; //BSTNode형 min을 선언하고 null을 넣어줍니다.
		BSTNode minParent = null; //BSTNode형 minParent를 선언하고 null을 넣어줍니다.
		BSTNode q = deleleBSTNode.getRight(); //BSTNode형 q를 선언하고 삽입된 노드의 getRight() (오른쪽 자식)을 넣어줍니다.
		while(q != null){ //q가 null과 같아질 때 까지 반복하는 반복문입니다.
			minParent = min; //minParent에 min을 넣어줍니다. 
			min = q; //min에 q를 넣어줍니다. (삽입된 노드의 오른쪽 자식)
			q = q.getLeft(); //q에 q의 getLeft() (왼쪽 자식) 을 넣어줍니다.
		}
		if (min != deleleBSTNode.getRight()){ //min이 삽입된 노드의 getRight() (오른쪽 자식) 과 같지 않을 경우를 확인하는 조건문입니다.
			minParent.setLeft(min.getRight()); //조건이 맞을 경우 minParent의 setLeft에 min의 getRight() (오른쪽 자식)을 넣어줍니다.
			min.setRight(deleleBSTNode.getRight()); //min의 setRight에 삽입된 노드의 getRight() (오른쪽 자식)을 넣어줍니다.
		}
		return min; //min을 반환해 줍니다.
	}
	
	public void print(){ //메인 클래스에서 트리를 출력하는 메서드입니다.
		printBST(root); //printBST메서드에 root를 삽입합니다.
		System.out.println(); //줄을 바꿔줍니다.
	}
	
	private void printBST(BSTNode root){ //BSTree클래스 내에서만 사용 가능한 printBST메서드로 BSTNode형 을 삽입받습니다.
		if (root != null){ // root가 null과 같지 않은지 확인하는 조건문입니다.
			System.out.print("<"); //조건이 맞을 경우 < 를 출력하는 출력문입니다.
			printBST(root.getLeft()); //printBST에 root의 getLeft() (왼쪽 자식)을 삽입합니다.
			System.out.print(root.getKey()); //root의 getKey() (부모)를 출력합니다.
			printBST(root.getRight()); //printBST에 root의 getRight() (오른쪽 자식)을 삽입합니다.
			System.out.print(">"); // > 를 출력합니다.
		}
	}
}
