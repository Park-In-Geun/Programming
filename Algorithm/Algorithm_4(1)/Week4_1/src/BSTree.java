
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
		deleteBST(this.root, key); //deleteBST 메서드에 this.root 값과 메서드에 삽입된 key값을 넣습니다.
	}
	
	private BSTNode minNode(BSTNode deleleBSTNode){ //BSTree 클래스 내에서만 사용 가능한 BSTNode형 minNode 메서드입니다. BSTNode형 을 삽입받습니다.
		BSTNode p = deleleBSTNode; // BSTNode형 p에 minNode 메서드에 삽입된 노드값을 넣습니다.
		if (p.getLeft() == null) return p; // p의 getLeft() 가 null과 같으면 (왼쪽 자식이 없는 경우) p를 반환해줍니다.
		else return minNode(p.getLeft()); // 위의 경우가 아닐 때는 minNode 메서드에 p의 getLeft()를 넣어 반환합니다.
	}
	
	private void deleteBST(BSTNode root, int key){ //BSTree 클래스 내에서만 사용 가능한 deleteBST메서드로 BSTNode형 root와, 정수형 key값을 삽입받습니다.
		BSTNode p = root; // BSTNode형 p를 생성하고 root 를 넣습니다. (기본 트리노드)
		BSTNode q = p; // BSTNode형 q를 생성하고 p 를 넣습니다. (p의 부모노드)
	
		while (p != null) // 부모노드 설정을 위한 반복문으로 p 가 null 과 같아질 때 까지 반복하는 반복문입니다.
		{ 
			if (key == p.getKey()) break; // 삽입된 key 값과 p의 getKey() 값과 같은지 확인하고 조건을 만족하면 break 를 사용해 반복문을 종료합니다.
			q = p; // q에 p를 넣습니다.
			if (key < p.getKey()) p = p.getLeft(); // 삽입된 key값이 p의 getkey() 값보다 작은지 확인하고 조건을 만족하면 p에 p의 getLeft() (왼쪽 자식) 를 넣습니다.
			else p = p.getRight(); // 위의 조건을 만족하지 않을 경우 p에 p의 getRight() (오른쪽 자식) 를 넣습니다.
		}
		
		if ( p == null) return; // p가 null과 같은지 확인하고 조건을 만족하면 아무것도 반환해 주지 않습니다.
		 
		//리프 노드 삭제
		if((p.getLeft() == null) && (p.getRight() == null)){ 
			// p의 getLeft() 그리고 p의 getRight() 가 둘다 null과 같은지 확인하는 조건문 입니다. (왼쪽과 오른쪽 자식, 즉 자식이 없는 경우)
			if(p == root){ root=null; } // 조건을 만족할 경우 p가 root와 같은지 확인하고 같으면 root에 null을 넣습니다.
			else if(q.getLeft() == p)  q.setLeft(null);  //p가 root와 같지 않을 때 q의 getLeft() (왼쪽 자식) 이 p 와 같은지를 확인하고 같으면 q의 setLeft로 null값을 넣어줍니다.(왼쪽 자식삭제)
			else  q.setRight(null); // 위의 두 조건을 만족하지 않을 경우 q의 setRight로 null값을 넣어줍니다. (오른쪽 자식 삭제)
		}
		
		//하나의 자식 == null
		else if ((p.getLeft() == null) || (p.getRight() == null)){
			//p의 getLeft() 또는 p의 getRight()가 null과 같은지 확인하는 조건문입니다. (왼쪽 또는 오른쪽 자식이 없는 경우)
			if(p == root) // 조건을 만족할 경우 p가 root와 같은지 확인하는 조건문입니다.
			{ 
				if(p.getLeft() == null) root = p.getRight(); 
				// p가 root와 같다는 조건을 만족할 경우 p의 getLeft() 가 null 값과 같은지(왼쪽 자식이 없는지) 확인하고 null과 같으면 root에 p의 getRight()를 넣어줍니다.
				else root = p.getLeft();  // p의 getLeft()가 null과 같지 않을 경우엔 root에 p의 getLeft() 를 넣어줍니다.
			}
			//Left child null
			else if(p.getLeft() != null){
				//p가 root값과 같지 않을 경우에 p의 getLeft()가 null값과 같지 않은지를 확인하는 조건문입니다.( 왼쪽 자식이 존재)
				if(q.getLeft() == p)  q.setLeft(p.getLeft());  
				//p의 getLeft()가 null값과 같지 않으면 q의 getLeft() 가 p와 같은지 확인하고(부모의 왼쪽 자식이 p와 같은지) 만족할 경우 q의 setLeft 로 p의 getLeft()를 넣어줍니다.
				//부모의 왼쪽 자식에 자식의 왼쪽 자식을 넣어줍니다.
				else q.setRight(p.getLeft()); //q의 getLeft()가 p와 같지 않으면 q의 setRight로 p의 getLeft()를 넣어줍니다. (부모의 오른쪽 자식에 자식의 왼쪽 자식을 넣어줍니다.)
			}
			
			//right child null
			else  // p = root 조건과 p.getLeft() != null 조건을 둘다 만족하지 않을 경우입니다.
			{
				if(q.getLeft() == p) q.setLeft(p.getRight());  
				//q의 getLeft 가 p와 같은지 확인하고 만족하면 q의 setLeft로 p의 getRight()를 넣어줍니다.
				//(부모의 왼쪽 자식이 p와 같은지 확인하고 만족시 부모의 왼쪽 자식에 자식의 오른쪽 자식을 넣어줍니다.
				else q.setRight(p.getRight()); //q.getLeft()==p 조건을 만족하지 않을 경우 q의 setRight로 p의 getRight를 넣어줍니다. (부모의 오른쪽 자식에 자식의 오른쪽 자식을 넣어줍니다.)
			}
		}
		
		//두개의 자식 right subtree minimum value
		else //리프 노드 조건과 하나의 자식이 null인 경우의 조건을 만족하지 않을 경우입니다.
		{
			BSTNode minValue = minNode(p.getRight()); //BSTNode형 minValue를 생성하고 minNode에 p의 getRight()를 삽입해서 나온 결과를 넣어줍니다.
			p.setKey(minValue.getKey()); //p의 setKey로 minValue의 getKey()를 넣어줍니다.
			if(p.getRight() == minValue) p.setRight(minValue.getRight());  
			//p의 getRight()가 minValue와 같은지 확인하고 만족시 p의 setRight로 minValue의 getRight()를 넣어줍니다.
			//p의 오른쪽 자식에 minValue의 오른쪽 자식을 넣어줍니다.
			deleteBST(p.getRight(),p.getKey()); //deleteBST메서드에 p의 getRight() 와 p의 getKey() 를 넣어줍니다.
		}
	}
	
	public boolean split(int key, BSTree bBST, BSTree cBST){
	//정수형 key값과 BSTree형 bBST, cBST 값이 삽입되는 boolean 형 메서드 split입니다. (트리 분할 메서드)
		BSTNode small = new BSTNode(); //BSTNode형 small 을 생성합니다.
		BSTNode large = new BSTNode(); //BSTNode형 large 를 생성합니다.
		BSTNode p = this.treeCopy(this.root); //BSTNode형 p를 생성하고 this.treeCopy 메서드에 this.root 를 삽입해 나온 결과를 넣습니다.
		BSTNode s = small; //BSTNode형 s를 생성하고 small 을 넣습니다.
		BSTNode l = large; //BSTNode형 l을 생성하고 large 를 넣습니다.
		while(p != null) //p가 null 과 같아질 때 까지 반복하는 반복문입니다.
		{
			if(key == p.getKey()){ // key가 p의 getKey() 와 같은지 확인하는 조건문입니다.
				s.setRight(p.getLeft()); //조건을 만족시 s의 setRight로 p의 getLeft()를 넣어줍니다.(s의 오른쪽 자식에 p의 왼쪽 자식을 넣습니다.)
				l.setLeft(p.getRight()); //l의 setLeft로 p의 getRight를 넣어줍니다. (l의 왼쪽 자식에 p의 오른쪽 자식을 넣습니다.)
				bBST.root = small.getRight(); // bBST의 root에 small의 getRight()를 넣습니다. ( bBST 를 small의 오른쪽 자식으로 구성된 트리로 구성합니다.)
				cBST.root = large.getLeft(); // cBST의 root에 large의 getLeft()를 넣습니다. ( cBST 를 large의 왼쪽 자식으로 구성된 트리로 구성합니다.)
				return true; //true를 반환합니다.
			}
			else if(key < p.getKey()){ // key == p.getKey() 조건을 만족하지 않을 시 key 가 p의 getKey()보다 작은지 확인하는 조건문 입니다.
				l.setLeft(p); // key < p.getKey() 조건을 만족시 l의 setLeft 로 p를 넣어줍니다. (l의 왼쪽 자식에 p를 넣어줍니다.)
				l = p; // l에 p를 넣어줍니다.
				p = p.getLeft(); //p 에 p의 getLeft()를 넣어줍니다. (p에 p의 왼쪽 자식을 넣습니다.)
			}
			else{ // key == p.getKey() 와 key < p.getKey() 조건을 둘 다 만족하지 않을 시 확인하는 조건문 입니다.
				s.setRight(p); //s의 setRight로 p를 넣어줍니다. (s의 오른쪽 자식에 p를 넣어줍니다.)
				s = p; //s 에 p를 넣어줍니다.
				p = p.getRight(); //p에 p의 getRight()를 넣어줍니다. (p에 p의오른쪽 자식을 넣습니다.)
			}
		}
		bBST.root = small.getRight(); // bBSt의 root에 small의 getRight를 넣어줍니다. ( bBST 를 small의 오른쪽 자식으로 구성된 트리로 구성합니다.)
		cBST.root = large.getLeft(); // cBST의 root에 large의 getLeft()를 넣습니다. ( cBST 를 large의 왼쪽 자식으로 구성된 트리로 구성합니다.)
		l.setLeft(null); //l의 setLeft로 null을 넣습니다. (l의 왼쪽 자식을 삭제합니다.)
		s.setRight(null); //s의 setRight로 null을 넣습니다. (s의 오른쪽 자식을 삭제합니다.)
		return false; //false 를 반환합니다.
	}
	
	private BSTNode treeCopy(BSTNode T) //BSTNode형 T 가 삽입되는 BSTree 클래스 내에서만 사용가능한 BSTNode형 treeCopy 메서드입니다.
	{
		BSTNode S, L, R; //BSTNode형 S,L,R 를 생성합니다.
		if(T != null) // T 가 null 과 같지 않은지 확인하는 조건문입니다.
		{
			L = treeCopy(T.getLeft()); // 조건을 만족시 L에 treeCopy에 T 의 getLeft() (왼쪽 자식) 를 삽입해 나온 결과를 넣습니다.
			R = treeCopy(T.getRight()); // R에 treeCopy에 T 의 getRight() (오른쪽 자식) 를 삽입해 나온 결과를 넣습니다.
			S = new BSTNode(T.getKey()); // S에 BSTNode에 T.getKey()를 삽입해 나온 결과를 넣습니다.
			S.setLeft(L); // S의 setLeft 로 L을 넣어줍니다. (S의 왼쪽 자식에 L을 넣어줍니다.)
			S.setRight(R); // S의 setRight 로 R을 넣어줍니다. (S의 오른쪽 자식에 R을 넣어줍니다.)
		}
		else //위의 조건을 만족하지 않을 경우입니다.
			return null; //null을 반환해줍니다.
		return S; //S를 반환해줍니다.
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