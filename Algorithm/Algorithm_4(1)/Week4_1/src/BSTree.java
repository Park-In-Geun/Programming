
public class BSTree { // Ʈ�� Ŭ�����Դϴ�.

	private BSTNode root; //BSTNode�� root ������ �����մϴ�.
	
	public BSTNode search(int key){ //BSTNode search �޼����Դϴ�. key���� �޽��ϴ�.
		BSTNode p; //BSTNode�� p�� �����մϴ�. 
		p = root; //p�� root�� �־��ݴϴ�.
		while(p != null){ //p�� null���� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(p.getKey() > key){ //p�� getKey()���� ���Ե� ������ key������ ū �� Ȯ���մϴ�.
				p = p.getLeft(); //������ ������� p�� p�� getLeft() (���� �ڽ�)�� �־��ݴϴ�.
			}
			else if(p.getKey() == key){ //���� ���ǰ� �ٸ� ���� p�� getKey���� ���Ե� ������ key���� ������ Ȯ���մϴ�.
				return p; //������ ������� p���� ��ȯ�մϴ�.
			} 
			else p = p.getRight(); //���� �� ������ ��� �������� ���� ��� p�� p�� getRight() (������ �ڽ�)�� �־��ݴϴ�.
		}
		return p; //p�� ��ȯ���ݴϴ�.
	}
	
	public void insert(int key){ //Ʈ���� ������ key���� �����ϴ� �޼����Դϴ�.
		BSTNode p,q=null; //BSTNode�� p,q �� �����ϰ� q�� null���� �־��ݴϴ�.
		
		p = root; //p�� root���� �־��ݴϴ�.
		while(p != null){ //p�� null���� �� �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
			if(key == p.getKey()) return; //key�� p�� getKey() ���� ������ Ȯ���ϰ� ������ ���� ��� �ƹ��͵� ��ȯ���� �ʽ��ϴ�.
			q = p; //q�� p���� �־��ݴϴ�.
			if(key < p.getKey()){ //key�� p�� getKey()������ ������ Ȯ���մϴ�.
				p = p.getLeft(); //p�� p�� getLeft() (���� �ڽ�) �� �־��ݴϴ�.
			}
			else{ //key�� p�� getKey() ������ Ŭ ����Դϴ�.
				p = p.getRight(); //p�� p�� getRight() (������ �ڽ�) �� �־��ݴϴ�.
			}
		}
		BSTNode newNode = new BSTNode(); //BSTNode�� newNode�� �����մϴ�.
		newNode.setKey(key); //newNode�� setKey�� key���� �־��ݴϴ�. (�θ�)
		newNode.setRight(null); //newNode�� setRight�� null���� �־��ݴϴ�. (������ �ڽ�)
		newNode.setLeft(null); //newNode�� setLeft�� null���� �־��ݴϴ�. (���� �ڽ�)
		if(root == null){ root = newNode;} //root�� null���� ������ Ȯ���ϰ� ������ ���� ��� root�� newNode�� �־��ݴϴ�.
		else if(key < q.getKey()){q.setLeft(newNode);;} 
		//q�� getKey���� key������ Ŭ ��츦 Ȯ���ϰ� ������ ���� ��� q.setLeft�� newNode�� �־��ݴϴ�. (q�� ���� �ڽĿ� newNode���� ����)
		else //���� �� ������ ��� �������� ���� ��쿡 �����մϴ�.
			q.setRight(newNode); //q�� setRight�� newNode�� �־��ݴϴ�. (q�� ������ �ڽĿ� newNode���� ����)
		return; //�ƹ��͵� ��ȯ���� �ʽ��ϴ�.
	}
	
	public void delete(int key){ //Ʈ������ ������ key���� �����ϴ� �޼����Դϴ�.
		deleteBST(this.root, key); //deleteBST �޼��忡 this.root ���� �޼��忡 ���Ե� key���� �ֽ��ϴ�.
	}
	
	private BSTNode minNode(BSTNode deleleBSTNode){ //BSTree Ŭ���� �������� ��� ������ BSTNode�� minNode �޼����Դϴ�. BSTNode�� �� ���Թ޽��ϴ�.
		BSTNode p = deleleBSTNode; // BSTNode�� p�� minNode �޼��忡 ���Ե� ��尪�� �ֽ��ϴ�.
		if (p.getLeft() == null) return p; // p�� getLeft() �� null�� ������ (���� �ڽ��� ���� ���) p�� ��ȯ���ݴϴ�.
		else return minNode(p.getLeft()); // ���� ��찡 �ƴ� ���� minNode �޼��忡 p�� getLeft()�� �־� ��ȯ�մϴ�.
	}
	
	private void deleteBST(BSTNode root, int key){ //BSTree Ŭ���� �������� ��� ������ deleteBST�޼���� BSTNode�� root��, ������ key���� ���Թ޽��ϴ�.
		BSTNode p = root; // BSTNode�� p�� �����ϰ� root �� �ֽ��ϴ�. (�⺻ Ʈ�����)
		BSTNode q = p; // BSTNode�� q�� �����ϰ� p �� �ֽ��ϴ�. (p�� �θ���)
	
		while (p != null) // �θ��� ������ ���� �ݺ������� p �� null �� ������ �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
		{ 
			if (key == p.getKey()) break; // ���Ե� key ���� p�� getKey() ���� ������ Ȯ���ϰ� ������ �����ϸ� break �� ����� �ݺ����� �����մϴ�.
			q = p; // q�� p�� �ֽ��ϴ�.
			if (key < p.getKey()) p = p.getLeft(); // ���Ե� key���� p�� getkey() ������ ������ Ȯ���ϰ� ������ �����ϸ� p�� p�� getLeft() (���� �ڽ�) �� �ֽ��ϴ�.
			else p = p.getRight(); // ���� ������ �������� ���� ��� p�� p�� getRight() (������ �ڽ�) �� �ֽ��ϴ�.
		}
		
		if ( p == null) return; // p�� null�� ������ Ȯ���ϰ� ������ �����ϸ� �ƹ��͵� ��ȯ�� ���� �ʽ��ϴ�.
		 
		//���� ��� ����
		if((p.getLeft() == null) && (p.getRight() == null)){ 
			// p�� getLeft() �׸��� p�� getRight() �� �Ѵ� null�� ������ Ȯ���ϴ� ���ǹ� �Դϴ�. (���ʰ� ������ �ڽ�, �� �ڽ��� ���� ���)
			if(p == root){ root=null; } // ������ ������ ��� p�� root�� ������ Ȯ���ϰ� ������ root�� null�� �ֽ��ϴ�.
			else if(q.getLeft() == p)  q.setLeft(null);  //p�� root�� ���� ���� �� q�� getLeft() (���� �ڽ�) �� p �� �������� Ȯ���ϰ� ������ q�� setLeft�� null���� �־��ݴϴ�.(���� �ڽĻ���)
			else  q.setRight(null); // ���� �� ������ �������� ���� ��� q�� setRight�� null���� �־��ݴϴ�. (������ �ڽ� ����)
		}
		
		//�ϳ��� �ڽ� == null
		else if ((p.getLeft() == null) || (p.getRight() == null)){
			//p�� getLeft() �Ǵ� p�� getRight()�� null�� ������ Ȯ���ϴ� ���ǹ��Դϴ�. (���� �Ǵ� ������ �ڽ��� ���� ���)
			if(p == root) // ������ ������ ��� p�� root�� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			{ 
				if(p.getLeft() == null) root = p.getRight(); 
				// p�� root�� ���ٴ� ������ ������ ��� p�� getLeft() �� null ���� ������(���� �ڽ��� ������) Ȯ���ϰ� null�� ������ root�� p�� getRight()�� �־��ݴϴ�.
				else root = p.getLeft();  // p�� getLeft()�� null�� ���� ���� ��쿣 root�� p�� getLeft() �� �־��ݴϴ�.
			}
			//Left child null
			else if(p.getLeft() != null){
				//p�� root���� ���� ���� ��쿡 p�� getLeft()�� null���� ���� �������� Ȯ���ϴ� ���ǹ��Դϴ�.( ���� �ڽ��� ����)
				if(q.getLeft() == p)  q.setLeft(p.getLeft());  
				//p�� getLeft()�� null���� ���� ������ q�� getLeft() �� p�� ������ Ȯ���ϰ�(�θ��� ���� �ڽ��� p�� ������) ������ ��� q�� setLeft �� p�� getLeft()�� �־��ݴϴ�.
				//�θ��� ���� �ڽĿ� �ڽ��� ���� �ڽ��� �־��ݴϴ�.
				else q.setRight(p.getLeft()); //q�� getLeft()�� p�� ���� ������ q�� setRight�� p�� getLeft()�� �־��ݴϴ�. (�θ��� ������ �ڽĿ� �ڽ��� ���� �ڽ��� �־��ݴϴ�.)
			}
			
			//right child null
			else  // p = root ���ǰ� p.getLeft() != null ������ �Ѵ� �������� ���� ����Դϴ�.
			{
				if(q.getLeft() == p) q.setLeft(p.getRight());  
				//q�� getLeft �� p�� ������ Ȯ���ϰ� �����ϸ� q�� setLeft�� p�� getRight()�� �־��ݴϴ�.
				//(�θ��� ���� �ڽ��� p�� ������ Ȯ���ϰ� ������ �θ��� ���� �ڽĿ� �ڽ��� ������ �ڽ��� �־��ݴϴ�.
				else q.setRight(p.getRight()); //q.getLeft()==p ������ �������� ���� ��� q�� setRight�� p�� getRight�� �־��ݴϴ�. (�θ��� ������ �ڽĿ� �ڽ��� ������ �ڽ��� �־��ݴϴ�.)
			}
		}
		
		//�ΰ��� �ڽ� right subtree minimum value
		else //���� ��� ���ǰ� �ϳ��� �ڽ��� null�� ����� ������ �������� ���� ����Դϴ�.
		{
			BSTNode minValue = minNode(p.getRight()); //BSTNode�� minValue�� �����ϰ� minNode�� p�� getRight()�� �����ؼ� ���� ����� �־��ݴϴ�.
			p.setKey(minValue.getKey()); //p�� setKey�� minValue�� getKey()�� �־��ݴϴ�.
			if(p.getRight() == minValue) p.setRight(minValue.getRight());  
			//p�� getRight()�� minValue�� ������ Ȯ���ϰ� ������ p�� setRight�� minValue�� getRight()�� �־��ݴϴ�.
			//p�� ������ �ڽĿ� minValue�� ������ �ڽ��� �־��ݴϴ�.
			deleteBST(p.getRight(),p.getKey()); //deleteBST�޼��忡 p�� getRight() �� p�� getKey() �� �־��ݴϴ�.
		}
	}
	
	public boolean split(int key, BSTree bBST, BSTree cBST){
	//������ key���� BSTree�� bBST, cBST ���� ���ԵǴ� boolean �� �޼��� split�Դϴ�. (Ʈ�� ���� �޼���)
		BSTNode small = new BSTNode(); //BSTNode�� small �� �����մϴ�.
		BSTNode large = new BSTNode(); //BSTNode�� large �� �����մϴ�.
		BSTNode p = this.treeCopy(this.root); //BSTNode�� p�� �����ϰ� this.treeCopy �޼��忡 this.root �� ������ ���� ����� �ֽ��ϴ�.
		BSTNode s = small; //BSTNode�� s�� �����ϰ� small �� �ֽ��ϴ�.
		BSTNode l = large; //BSTNode�� l�� �����ϰ� large �� �ֽ��ϴ�.
		while(p != null) //p�� null �� ������ �� ���� �ݺ��ϴ� �ݺ����Դϴ�.
		{
			if(key == p.getKey()){ // key�� p�� getKey() �� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
				s.setRight(p.getLeft()); //������ ������ s�� setRight�� p�� getLeft()�� �־��ݴϴ�.(s�� ������ �ڽĿ� p�� ���� �ڽ��� �ֽ��ϴ�.)
				l.setLeft(p.getRight()); //l�� setLeft�� p�� getRight�� �־��ݴϴ�. (l�� ���� �ڽĿ� p�� ������ �ڽ��� �ֽ��ϴ�.)
				bBST.root = small.getRight(); // bBST�� root�� small�� getRight()�� �ֽ��ϴ�. ( bBST �� small�� ������ �ڽ����� ������ Ʈ���� �����մϴ�.)
				cBST.root = large.getLeft(); // cBST�� root�� large�� getLeft()�� �ֽ��ϴ�. ( cBST �� large�� ���� �ڽ����� ������ Ʈ���� �����մϴ�.)
				return true; //true�� ��ȯ�մϴ�.
			}
			else if(key < p.getKey()){ // key == p.getKey() ������ �������� ���� �� key �� p�� getKey()���� ������ Ȯ���ϴ� ���ǹ� �Դϴ�.
				l.setLeft(p); // key < p.getKey() ������ ������ l�� setLeft �� p�� �־��ݴϴ�. (l�� ���� �ڽĿ� p�� �־��ݴϴ�.)
				l = p; // l�� p�� �־��ݴϴ�.
				p = p.getLeft(); //p �� p�� getLeft()�� �־��ݴϴ�. (p�� p�� ���� �ڽ��� �ֽ��ϴ�.)
			}
			else{ // key == p.getKey() �� key < p.getKey() ������ �� �� �������� ���� �� Ȯ���ϴ� ���ǹ� �Դϴ�.
				s.setRight(p); //s�� setRight�� p�� �־��ݴϴ�. (s�� ������ �ڽĿ� p�� �־��ݴϴ�.)
				s = p; //s �� p�� �־��ݴϴ�.
				p = p.getRight(); //p�� p�� getRight()�� �־��ݴϴ�. (p�� p�ǿ����� �ڽ��� �ֽ��ϴ�.)
			}
		}
		bBST.root = small.getRight(); // bBSt�� root�� small�� getRight�� �־��ݴϴ�. ( bBST �� small�� ������ �ڽ����� ������ Ʈ���� �����մϴ�.)
		cBST.root = large.getLeft(); // cBST�� root�� large�� getLeft()�� �ֽ��ϴ�. ( cBST �� large�� ���� �ڽ����� ������ Ʈ���� �����մϴ�.)
		l.setLeft(null); //l�� setLeft�� null�� �ֽ��ϴ�. (l�� ���� �ڽ��� �����մϴ�.)
		s.setRight(null); //s�� setRight�� null�� �ֽ��ϴ�. (s�� ������ �ڽ��� �����մϴ�.)
		return false; //false �� ��ȯ�մϴ�.
	}
	
	private BSTNode treeCopy(BSTNode T) //BSTNode�� T �� ���ԵǴ� BSTree Ŭ���� �������� ��밡���� BSTNode�� treeCopy �޼����Դϴ�.
	{
		BSTNode S, L, R; //BSTNode�� S,L,R �� �����մϴ�.
		if(T != null) // T �� null �� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
		{
			L = treeCopy(T.getLeft()); // ������ ������ L�� treeCopy�� T �� getLeft() (���� �ڽ�) �� ������ ���� ����� �ֽ��ϴ�.
			R = treeCopy(T.getRight()); // R�� treeCopy�� T �� getRight() (������ �ڽ�) �� ������ ���� ����� �ֽ��ϴ�.
			S = new BSTNode(T.getKey()); // S�� BSTNode�� T.getKey()�� ������ ���� ����� �ֽ��ϴ�.
			S.setLeft(L); // S�� setLeft �� L�� �־��ݴϴ�. (S�� ���� �ڽĿ� L�� �־��ݴϴ�.)
			S.setRight(R); // S�� setRight �� R�� �־��ݴϴ�. (S�� ������ �ڽĿ� R�� �־��ݴϴ�.)
		}
		else //���� ������ �������� ���� ����Դϴ�.
			return null; //null�� ��ȯ���ݴϴ�.
		return S; //S�� ��ȯ���ݴϴ�.
	}
	
	public void print(){ //���� Ŭ�������� Ʈ���� ����ϴ� �޼����Դϴ�.
		printBST(root); //printBST�޼��忡 root�� �����մϴ�.
		System.out.println(); //���� �ٲ��ݴϴ�.
	}
	
	private void printBST(BSTNode root){ //BSTreeŬ���� �������� ��� ������ printBST�޼���� BSTNode�� �� ���Թ޽��ϴ�.
		if (root != null){ // root�� null�� ���� ������ Ȯ���ϴ� ���ǹ��Դϴ�.
			System.out.print("<"); //������ ���� ��� < �� ����ϴ� ��¹��Դϴ�.
			printBST(root.getLeft()); //printBST�� root�� getLeft() (���� �ڽ�)�� �����մϴ�.
			System.out.print(root.getKey()); //root�� getKey() (�θ�)�� ����մϴ�.
			printBST(root.getRight()); //printBST�� root�� getRight() (������ �ڽ�)�� �����մϴ�.
			System.out.print(">"); // > �� ����մϴ�.
		}
	}
}